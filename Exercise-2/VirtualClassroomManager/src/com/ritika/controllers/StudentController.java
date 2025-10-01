package com.ritika.controllers;

import com.ritika.models.Classroom;
import com.ritika.services.StudentService;
import com.ritika.utils.LoggerUtil;

public class StudentController {

    private StudentService studentService;
    private ClassroomController classroomController;

    public StudentController(ClassroomController classroomController) {
        this.studentService = new StudentService();
        this.classroomController = classroomController;
    }

    public void addStudent(String studentId, String className) {
        LoggerUtil logger = LoggerUtil.getInstance();
        Classroom classroom = classroomController.getClassroom(className);
        studentService.enrollStudent(studentId, classroom);
        System.out.println("Student [" + studentId + "] has been enrolled in [" + className + "].");
        logger.log("Student added: " + studentId + " to classroom " + className);
    }
}
