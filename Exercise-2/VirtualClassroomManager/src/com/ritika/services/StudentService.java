package com.ritika.services;

import com.ritika.models.Student;
import com.ritika.models.Classroom;
import com.ritika.exceptions.StudentException;

public class StudentService {
    public void enrollStudent(String studentId, Classroom classroom) {
        if(classroom.getStudents().stream().anyMatch(s -> s.getId().equals(studentId))) {
            throw new StudentException("Student already enrolled.");
        }
        classroom.addStudent(new Student(studentId));
    }

    public void listStudents(Classroom classroom) {
        if(classroom.getStudents().isEmpty()) {
            System.out.println("No students in classroom.");
            return;
        }
        classroom.getStudents().forEach(s -> System.out.println(s.getId()));
    }
}
