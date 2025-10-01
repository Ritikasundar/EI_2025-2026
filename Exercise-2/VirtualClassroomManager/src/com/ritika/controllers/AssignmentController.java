package com.ritika.controllers;

import com.ritika.models.Classroom;
import com.ritika.models.Student;
import com.ritika.models.Assignment;
import com.ritika.services.AssignmentService;
import com.ritika.utils.LoggerUtil;

public class AssignmentController {

    private AssignmentService assignmentService;
    private ClassroomController classroomController;
    private StudentController studentController;

    public AssignmentController(ClassroomController classroomController, StudentController studentController) {
        this.assignmentService = new AssignmentService();
        this.classroomController = classroomController;
        this.studentController = studentController;
    }

    // Schedule assignment
    public void scheduleAssignment(String className, String assignmentDetails) {
        LoggerUtil logger = LoggerUtil.getInstance();
        Classroom classroom = classroomController.getClassroom(className);
        Assignment assignment = assignmentService.scheduleAssignment(assignmentDetails, classroom);
        System.out.println("Assignment for [" + className + "] has been scheduled.");
        logger.log("Assignment scheduled for " + className + ": " + assignmentDetails);
    }

    // Submit assignment
    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        LoggerUtil logger = LoggerUtil.getInstance();
        Classroom classroom = classroomController.getClassroom(className);
        Student student = classroom.getStudents().stream()
                .filter(s -> s.getId().equals(studentId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not found in classroom."));
        assignmentService.submitAssignment(assignmentDetails, student, classroom);
        logger.log("Assignment submitted by " + studentId + " in " + className);
    }
}
