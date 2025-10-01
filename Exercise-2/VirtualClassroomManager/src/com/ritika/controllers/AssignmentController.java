package com.ritika.controllers;

import com.ritika.services.AssignmentService;
import com.ritika.utils.LoggerUtil;
import com.ritika.exceptions.AssignmentException;

public class AssignmentController {

    private AssignmentService assignmentService; // Service layer handling assignment logic

    // Constructor injects ClassroomController to access classroom data
    public AssignmentController(ClassroomController classroomController) {
        this.assignmentService = new AssignmentService(classroomController.getClassroomService());
    }

    // Schedule a new assignment for a classroom
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

    // Submit an assignment for a student in a classroom
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

    // View all submissions for a specific assignment
    public void viewAssignmentSubmissions(String className, String assignmentId) {
        try {
            assignmentService.viewAssignmentSubmissions(className, assignmentId);
            LoggerUtil.log("Viewed assignment submissions for [" + assignmentId + "] in [" + className + "].");
        } catch (AssignmentException e) {
            LoggerUtil.log("Error viewing submissions: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    // Print all logs to console
    public void printLogs() {
        LoggerUtil.printLog();
    }
}
