package com.ritika.models;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;                // Classroom name
    private List<Student> students;     // List of enrolled students
    private List<Assignment> assignments; // List of assignments for this classroom

    // Constructor initializes classroom name, student list, and assignments list
    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    // Get classroom name
    public String getName() {
        return name;
    }

    // Add a student to the classroom
    public void addStudent(Student student) {
        students.add(student);
    }

    // Get list of students
    public List<Student> getStudents() {
        return students;
    }

    // Find a student by ID
    public Student getStudentById(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    // Add an assignment, preventing duplicates by ID
    public void addAssignment(Assignment assignment) {
        for (Assignment existing : assignments) {
            if (existing.getAssignmentId().equals(assignment.getAssignmentId())) {
                throw new RuntimeException("Assignment [" + assignment.getAssignmentId() + "] already exists in [" + this.name + "].");
            }
        }
        assignments.add(assignment);
    }

    // Get assignment by ID
    public Assignment getAssignment(String assignmentId) {
        for (Assignment assignment : assignments) {
            if (assignment.getAssignmentId().equals(assignmentId)) {
                return assignment;
            }
        }
        return null;
    }

    // Get list of all assignments
    public List<Assignment> getAssignments() {
        return assignments;
    }
}
