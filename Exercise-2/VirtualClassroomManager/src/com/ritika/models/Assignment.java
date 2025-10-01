package com.ritika.models;

import java.util.HashSet;
import java.util.Set;

public class Assignment {
    private String assignmentId; // Unique ID for the assignment
    private String details;      // Description/details of the assignment
    private Set<String> submittedStudents; // Track unique student submissions

    // Constructor initializes assignment ID, details, and submission tracker
    public Assignment(String assignmentId, String details) {
        this.assignmentId = assignmentId;
        this.details = details;
        this.submittedStudents = new HashSet<>();
    }

    // Get assignment ID
    public String getAssignmentId() {
        return assignmentId;
    }

    // Get assignment details
    public String getDetails() {
        return details;
    }

    // Mark assignment as submitted by a student; returns false if already submitted
    public boolean markSubmitted(String studentId) {
        if (submittedStudents.contains(studentId)) {
            return false; // Student already submitted
        }
        submittedStudents.add(studentId);
        return true; // First submission
    }

    // Return set of students who have submitted
    public Set<String> getSubmittedStudents() {
        return submittedStudents;
    }
}
