package com.ritika.services;

import com.ritika.models.Classroom;
import com.ritika.models.Student;
import com.ritika.exceptions.StudentException;
import com.ritika.exceptions.ClassroomException;

import java.util.List;

public class StudentService {

    private ClassroomService classroomService;

    public StudentService(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    public void addStudent(String studentId, String className) {
        Classroom classroom = classroomService.getClassroom(className);

        // Defensive programming - check duplicate student IDs
        for (Student s : classroom.getStudents()) {
            if (s.getId().equals(studentId)) {
                throw new StudentException("Student with ID " + studentId + " already exists in " + className);
            }
        }

        Student student = new Student(studentId);
        classroom.addStudent(student);
    }

   
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
