package com.ritika.controllers;

import com.ritika.services.AssignmentService;
import com.ritika.controllers.ClassroomController;
import com.ritika.utils.LoggerUtil;

public class AssignmentController {

    private AssignmentService assignmentService;

    public AssignmentController(ClassroomController classroomController) {
        this.assignmentService = new AssignmentService(classroomController.getClassroomService());
    }

    public void scheduleAssignment(String className, String assignmentId, String assignmentDetails) {
        assignmentService.scheduleAssignment(className, assignmentId, assignmentDetails);
        LoggerUtil.log("Assignment [" + assignmentId + "] scheduled for classroom [" + className + "].");
        System.out.println("Assignment [" + assignmentId + "] scheduled for classroom [" + className + "].");
    }

    public void submitAssignment(String studentId, String className, String assignmentId) {
        assignmentService.submitAssignment(studentId, className, assignmentId);
        LoggerUtil.log("Assignment [" + assignmentId + "] submitted by student [" + studentId + "] in [" + className + "].");
        System.out.println("Assignment [" + assignmentId + "] submitted by student [" + studentId + "] in [" + className + "].");
    }

    public void viewAssignmentSubmissions(String className, String assignmentId) {
        assignmentService.viewAssignmentSubmissions(className, assignmentId);
        LoggerUtil.log("Viewed assignment submissions for assignment [" + assignmentId + "] in [" + className + "].");
    }

    public void printLogs() {
        LoggerUtil.printLog();
    }
}
