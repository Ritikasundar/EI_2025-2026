package com.ritika.services;

import com.ritika.models.Classroom;
import com.ritika.models.Student;
import com.ritika.exceptions.StudentException;

import java.util.List;

public class StudentService {

    private ClassroomService classroomService; // Access classroom data and operations

    // Constructor injects ClassroomService dependency
    public StudentService(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    // Add a student to a classroom with duplicate ID check
    public void addStudent(String studentId, String className) {
        Classroom classroom = classroomService.getClassroom(className);

        // Defensive programming: check for duplicate student IDs
        for (Student s : classroom.getStudents()) {
            if (s.getId().equals(studentId)) {
                throw new StudentException("Student with ID " + studentId + " already exists in " + className);
            }
        }

        Student student = new Student(studentId);
        classroom.addStudent(student);
    }

    // List all students in a classroom
    public void listStudents(String className) {
        Classroom classroom = classroomService.getClassroom(className);
        List<Student> students = classroom.getStudents();

        if (students.isEmpty()) {
            System.out.println("No students enrolled in classroom [" + className + "].");
            return;
        }

        System.out.println("Students in classroom [" + className + "]:");
        for (Student student : students) {
            System.out.println("- " + student.getId());
        }
    }
}
