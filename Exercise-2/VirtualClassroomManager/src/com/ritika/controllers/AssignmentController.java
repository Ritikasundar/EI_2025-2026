package com.ritika.controllers;

import com.ritika.services.AssignmentService;
import com.ritika.controllers.ClassroomController;

public class AssignmentController {

    private AssignmentService assignmentService;

    public AssignmentController(ClassroomController classroomController) {
        this.assignmentService = new AssignmentService(classroomController.getClassroomService());
    }

    public void scheduleAssignment(String className, String assignmentId, String assignmentDetails) {
        assignmentService.scheduleAssignment(className, assignmentId, assignmentDetails);
        System.out.println("Assignment [" + assignmentId + "] scheduled for classroom [" + className + "].");
    }

    public void submitAssignment(String studentId, String className, String assignmentId) {
        assignmentService.submitAssignment(studentId, className, assignmentId);
        System.out.println("Assignment [" + assignmentId + "] submitted by student [" + studentId + "] in [" + className + "].");
    }

    public void viewAssignmentSubmissions(String className, String assignmentId) {
        assignmentService.viewAssignmentSubmissions(className, assignmentId);
    }
}
