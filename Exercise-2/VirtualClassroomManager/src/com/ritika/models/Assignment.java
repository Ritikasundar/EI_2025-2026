package com.ritika.models;

import java.util.HashSet;
import java.util.Set;

public class Assignment {
    private String assignmentId;
    private String details;
    private Set<String> submittedStudents; // track unique submissions

    public Assignment(String assignmentId, String details) {
        this.assignmentId = assignmentId;
        this.details = details;
        this.submittedStudents = new HashSet<>();
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public String getDetails() {
        return details;
    }

    public boolean markSubmitted(String studentId) {
        if (submittedStudents.contains(studentId)) {
            return false; // already submitted
        }
        submittedStudents.add(studentId);
        return true; // first submission
    }

    public Set<String> getSubmittedStudents() {
        return submittedStudents;
    }
}
