package com.ritika.services;

import com.ritika.models.Assignment;
import com.ritika.models.Classroom;
import com.ritika.models.Student;

public class AssignmentService {

    public Assignment scheduleAssignment(String details, Classroom classroom) {
        Assignment assignment = new Assignment(details);
        classroom.addAssignment(assignment);
        return assignment;
    }

    public void submitAssignment(String details, Student student, Classroom classroom) {
        Assignment assignment = classroom.getAssignments().stream()
                .filter(a -> a.getDetails().equals(details) && !a.isSubmitted())
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Assignment not found or already submitted."));
        assignment.submit();
        System.out.println("Assignment submitted by Student " + student.getId() + " in " + classroom.getName());
    }
}
