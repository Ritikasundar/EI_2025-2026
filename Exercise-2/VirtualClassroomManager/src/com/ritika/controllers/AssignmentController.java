package com.ritika.controllers;

import com.ritika.services.AssignmentService;
import com.ritika.controllers.ClassroomController;
import com.ritika.utils.LoggerUtil;
import com.ritika.exceptions.AssignmentException;

public class AssignmentController {

    private AssignmentService assignmentService;

    public AssignmentController(ClassroomController classroomController) {
        this.assignmentService = new AssignmentService(classroomController.getClassroomService());
    }

    public void scheduleAssignment(String className, String assignmentId, String assignmentDetails) {
        try {
            assignmentService.scheduleAssignment(className, assignmentId, assignmentDetails);
            LoggerUtil.log("Assignment [" + assignmentId + "] scheduled for classroom [" + className + "].");
            System.out.println("Assignment [" + assignmentId + "] scheduled for classroom [" + className + "].");
        } catch (AssignmentException e) {
            LoggerUtil.log("Error scheduling assignment: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    public void submitAssignment(String studentId, String className, String assignmentId) {
        try {
            assignmentService.submitAssignment(studentId, className, assignmentId);
            LoggerUtil.log("Assignment [" + assignmentId + "] submitted by student [" + studentId + "] in [" + className + "].");
            System.out.println("Assignment [" + assignmentId + "] submitted by student [" + studentId + "] in [" + className + "].");
        } catch (AssignmentException e) {
            LoggerUtil.log("Error submitting assignment: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    public void viewAssignmentSubmissions(String className, String assignmentId) {
        try {
            assignmentService.viewAssignmentSubmissions(className, assignmentId);
            LoggerUtil.log("Viewed assignment submissions for [" + assignmentId + "] in [" + className + "].");
        } catch (AssignmentException e) {
            LoggerUtil.log("Error viewing submissions: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    public void printLogs() {
        LoggerUtil.printLog();
    }
}
