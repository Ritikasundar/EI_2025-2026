package com.ritika.controllers;

import com.ritika.services.ClassroomService;
import com.ritika.models.Classroom;
import com.ritika.models.Student;
import com.ritika.models.Assignment;
import com.ritika.utils.LoggerUtil;
import com.ritika.exceptions.ClassroomException;

public class ClassroomController {

    private ClassroomService classroomService; // Service layer handling classroom operations

    // Constructor initializes the ClassroomService
    public ClassroomController() {
        this.classroomService = new ClassroomService();
    }

    // Getter for ClassroomService (used by other controllers if needed)
    public ClassroomService getClassroomService() {
        return classroomService;
    }

    // Add a new classroom and log the action
    public void addClassroom(String name) {
        classroomService.addClassroom(name);
        LoggerUtil.log("Classroom [" + name + "] added.");
        System.out.println("Classroom [" + name + "] has been created.");
    }

    // Remove an existing classroom and log the action
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

    // Remove a student from a classroom by student ID
    public void removeStudent(String studentId, String className) {
        try {
            Classroom classroom = classroomService.getClassroom(className);
            Student studentToRemove = classroom.getStudentById(studentId);
            if (studentToRemove == null) {
                System.out.println("Student [" + studentId + "] not found in classroom [" + className + "].");
                return;
            }
            classroom.getStudents().remove(studentToRemove);
            LoggerUtil.log("Student [" + studentId + "] removed from classroom [" + className + "].");
            System.out.println("Student [" + studentId + "] has been removed from [" + className + "].");
        } catch (ClassroomException e) {
            LoggerUtil.log("Error removing student: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    // Remove an assignment from a classroom by assignment ID
    public void removeAssignment(String assignmentId, String className) {
        try {
            Classroom classroom = classroomService.getClassroom(className);
            Assignment assignmentToRemove = classroom.getAssignment(assignmentId);
            if (assignmentToRemove == null) {
                System.out.println("Assignment [" + assignmentId + "] not found in classroom [" + className + "].");
                return;
            }
            classroom.getAssignments().remove(assignmentToRemove);
            LoggerUtil.log("Assignment [" + assignmentId + "] removed from classroom [" + className + "].");
            System.out.println("Assignment [" + assignmentId + "] has been removed from [" + className + "].");
        } catch (ClassroomException e) {
            LoggerUtil.log("Error removing assignment: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }

    // List all assignments in a classroom 
    public void listAssignments(String className) {
        try {
            Classroom classroom = classroomService.getClassroom(className);
            if (classroom.getAssignments().isEmpty()) {
                System.out.println("No assignments found in classroom [" + className + "].");
                return;
            }

            System.out.println("Assignments in classroom [" + className + "]:");
            // Iterate through all assignments and print their details
            for (Assignment a : classroom.getAssignments()) {
                System.out.println("- ID: " + a.getAssignmentId() + ", Details: " + a.getDetails());
            }
            LoggerUtil.log("Listed assignments for classroom [" + className + "].");
        } catch (ClassroomException e) {
            LoggerUtil.log("Error listing assignments: " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
