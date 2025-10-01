package com.ritika.services;

import com.ritika.models.Assignment;
import com.ritika.models.Classroom;
import com.ritika.models.Student;
import com.ritika.exceptions.AssignmentException;

public class AssignmentService {

    private ClassroomService classroomService; // Access classroom data and operations

    // Constructor injects ClassroomService dependency
    public AssignmentService(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    // Schedule a new assignment in a classroom
    public void scheduleAssignment(String className, String assignmentId, String assignmentDetails) {
        Classroom classroom = classroomService.getClassroom(className);
        if (classroom == null) {
            throw new AssignmentException("Classroom [" + className + "] does not exist.");
        }
        try {
            classroom.addAssignment(new Assignment(assignmentId, assignmentDetails));
        } catch (RuntimeException e) {
            throw new AssignmentException(e.getMessage()); // Rethrow duplicate assignment as domain-specific exception
        }
    }

    // Submit an assignment for a student; handles duplicate submissions
    public void submitAssignment(String studentId, String className, String assignmentId) {
        Classroom classroom = classroomService.getClassroom(className);
        if (classroom == null) {
            throw new AssignmentException("Classroom [" + className + "] does not exist.");
        }

        Assignment assignment = classroom.getAssignment(assignmentId);
        if (assignment == null) {
            throw new AssignmentException("Assignment [" + assignmentId + "] not found in [" + className + "].");
        }

        Student student = classroom.getStudentById(studentId);
        if (student == null) {
            throw new AssignmentException("Student [" + studentId + "] not found in [" + className + "].");
        }

        boolean success = assignment.markSubmitted(studentId);
        if (!success) {
            throw new AssignmentException("Student [" + studentId + "] has already submitted Assignment [" + assignmentId + "] in [" + className + "].");
        }
    }

    // View all students who have submitted a specific assignment
    public void viewAssignmentSubmissions(String className, String assignmentId) {
        Classroom classroom = classroomService.getClassroom(className);
        if (classroom == null) {
            throw new AssignmentException("Classroom [" + className + "] does not exist.");
        }

        Assignment assignment = classroom.getAssignment(assignmentId);
        if (assignment == null) {
            throw new AssignmentException("Assignment [" + assignmentId + "] not found in [" + className + "].");
        }

        System.out.println("Submissions for Assignment [" + assignmentId + "] in Class [" + className + "]:");
        if (assignment.getSubmittedStudents().isEmpty()) {
            System.out.println("No submissions yet.");
        } else {
            for (String studentId : assignment.getSubmittedStudents()) {
                System.out.println("- Student " + studentId);
            }
        }
    }
}
