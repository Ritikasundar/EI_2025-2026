package com.ritika.controllers;

import com.ritika.services.ClassroomService;
import com.ritika.models.Classroom;
import com.ritika.utils.LoggerUtil;

public class ClassroomController {

    private ClassroomService classroomService;

    public ClassroomController() {
        this.classroomService = new ClassroomService();
    }

    public void addClassroom(String className) {
        LoggerUtil logger = LoggerUtil.getInstance();
        classroomService.addClassroom(className);
        System.out.println("Classroom [" + className + "] has been created.");
        logger.log("Classroom added: " + className);
    }

    public Classroom getClassroom(String className) {
        return classroomService.getClassroom(className);
    }

    public void listClassrooms() {
        classroomService.listClassrooms();
    }

    public void removeClassroom(String className) {
        LoggerUtil logger = LoggerUtil.getInstance();
        classroomService.removeClassroom(className);
        System.out.println("Classroom [" + className + "] has been removed.");
        logger.log("Classroom removed: " + className);
    }
}
