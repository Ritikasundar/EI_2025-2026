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

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    // ✅ Get assignment by ID
    public Assignment getAssignmentById(String assignmentId) {
        for (Assignment a : assignments) {
            if (a.getId().equals(assignmentId)) {
                return a;
            }
        }
        return null;
    }

    // ✅ Get student by ID
    public Student getStudentById(String studentId) {
        for (Student s : students) {
            if (s.getId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }
}
