package com.ritika.services;

import com.ritika.models.Classroom;
import com.ritika.models.Student;
import com.ritika.models.Assignment;
import com.ritika.exceptions.AssignmentException;
import com.ritika.exceptions.ClassroomException;

import java.util.List;
import java.util.ArrayList;

public class AssignmentService {

    private ClassroomService classroomService;

    public AssignmentService(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    public void scheduleAssignment(String className, String assignmentId, String assignmentDetails) {
        Classroom classroom = classroomService.getClassroom(className);
        Assignment assignment = new Assignment(assignmentId, assignmentDetails);
        classroom.addAssignment(assignment);
    }

    public void submitAssignment(String studentId, String className, String assignmentId) {
        Classroom classroom = classroomService.getClassroom(className);
        Assignment assignment = classroom.getAssignmentById(assignmentId);
        if (assignment == null) {
            throw new AssignmentException("Assignment not found with ID: " + assignmentId);
        }

        Student student = classroom.getStudentById(studentId);
        if (student == null) {
            throw new ClassroomException("Student not found in classroom: " + studentId);
        }

        assignment.markSubmitted(student);
    }

    public void viewAssignmentSubmissions(String className, String assignmentId) {
        Classroom classroom = classroomService.getClassroom(className);
        Assignment assignment = classroom.getAssignmentById(assignmentId);

        if (assignment == null) {
            throw new AssignmentException("Assignment not found with ID: " + assignmentId);
        }

        List<Student> submitted = assignment.getSubmittedStudents();
        List<Student> notSubmitted = new ArrayList<>();

        for (Student student : classroom.getStudents()) {
            if (!submitted.contains(student)) {
                notSubmitted.add(student);
            }
        }

        System.out.println("Assignment ID: [" + assignmentId + "] in Classroom [" + className + "]");
        System.out.println("\nStudents who submitted:");
        if (submitted.isEmpty()) {
            System.out.println("- None");
        } else {
            for (Student s : submitted) {
                System.out.println("- " + s.getId());
            }
        }

        System.out.println("\nStudents who did not submit:");
        if (notSubmitted.isEmpty()) {
            System.out.println("- None");
        } else {
            for (Student s : notSubmitted) {
                System.out.println("- " + s.getId());
            }
        }
    }
}
