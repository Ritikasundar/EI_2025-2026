package com.ritika.controllers;

import com.ritika.services.StudentService;
import com.ritika.services.ClassroomService;
import com.ritika.utils.LoggerUtil;

public class StudentController {

    private StudentService studentService;

    public StudentController(ClassroomController classroomController) {
        this.studentService = new StudentService(classroomController.getClassroomService());
    }

    public void addStudent(String studentId, String className) {
        LoggerUtil logger = LoggerUtil.getInstance();
        studentService.addStudent(studentId, className);
        System.out.println("Student [" + studentId + "] has been enrolled in [" + className + "].");
        logger.log("Student added: " + studentId + " to " + className);
    }

    
    public void listStudents(String className) {
        studentService.listStudents(className);
    }
}
