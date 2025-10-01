package com.ritika.models;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private List<Student> students;
    private List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentById(String studentId) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    public void addAssignment(Assignment assignment) {
        // Prevent duplicate assignment IDs
        for (Assignment existing : assignments) {
            if (existing.getAssignmentId().equals(assignment.getAssignmentId())) {
                throw new RuntimeException("Assignment [" + assignment.getAssignmentId() + "] already exists in [" + this.name + "].");
            }
        }
        assignments.add(assignment);
    }

    public Assignment getAssignment(String assignmentId) {
        for (Assignment assignment : assignments) {
            if (assignment.getAssignmentId().equals(assignmentId)) {
                return assignment;
            }
        }
        return null;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }
}
