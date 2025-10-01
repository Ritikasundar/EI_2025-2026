package com.ritika.controllers;

import com.ritika.services.ClassroomService;
import com.ritika.utils.LoggerUtil;

public class ClassroomController {

    private ClassroomService classroomService; // Service layer for classroom operations

    // Constructor initializes the service
    public ClassroomController() {
        this.classroomService = new ClassroomService();
    }

    // Getter for service (used by other controllers)
    public ClassroomService getClassroomService() {
        return classroomService;
    }

    // Add a new classroom
    public void addClassroom(String name) {
        classroomService.addClassroom(name);
        LoggerUtil.log("Classroom [" + name + "] added.");
        System.out.println("Classroom [" + name + "] has been created.");
    }

    // Remove an existing classroom
    public void removeClassroom(String name) {
        classroomService.removeClassroom(name);
        LoggerUtil.log("Classroom [" + name + "] removed.");
        System.out.println("Classroom [" + name + "] has been removed.");
    }

    // List all classrooms
    public void listClassrooms() {
        classroomService.listClassrooms();
        LoggerUtil.log("Listed all classrooms.");
    }
}
