package com.ritika.controllers;

import com.ritika.services.StudentService;
import com.ritika.utils.LoggerUtil;

public class StudentController {

    private StudentService studentService; // Service layer for student operations

    // Constructor injects ClassroomController to access classrooms
    public StudentController(ClassroomController classroomController) {
        this.studentService = new StudentService(classroomController.getClassroomService());
    }

    // Enroll a student into a classroom
    public void addStudent(String studentId, String className) {
        studentService.addStudent(studentId, className);
        LoggerUtil.log("Student [" + studentId + "] added to classroom [" + className + "].");
        System.out.println("Student [" + studentId + "] has been enrolled in [" + className + "].");
    }

    // List all students in a classroom
    public void listStudents(String className) {
        studentService.listStudents(className);
        LoggerUtil.log("Listed students in classroom [" + className + "].");
    }
}
