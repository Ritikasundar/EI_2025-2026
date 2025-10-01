package com.ritika.controllers;

import com.ritika.models.Classroom;
import com.ritika.services.ClassroomService;
import com.ritika.utils.LoggerUtil;

public class ClassroomController {

    private ClassroomService classroomService;

    public ClassroomController() {
        this.classroomService = new ClassroomService();
    }

    public ClassroomService getClassroomService() {
        return classroomService;
    }

    public void addClassroom(String name) {
        classroomService.addClassroom(name);
        LoggerUtil.log("Classroom [" + name + "] added.");
        System.out.println("Classroom [" + name + "] has been created.");
    }

    public void removeClassroom(String name) {
        classroomService.removeClassroom(name);
        LoggerUtil.log("Classroom [" + name + "] removed.");
        System.out.println("Classroom [" + name + "] has been removed.");
    }

    public void listClassrooms() {
        classroomService.listClassrooms();
        LoggerUtil.log("Listed all classrooms.");
    }
}
