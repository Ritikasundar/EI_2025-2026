package com.ritika.models;

import java.util.ArrayList;
import java.util.List;

public class Assignment {

    private String id;  // ✅ unique ID
    private String details;
    private List<Student> submittedStudents;

    public Assignment(String id, String details) {
        this.id = id;
        this.details = details;
        this.submittedStudents = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getDetails() {
        return details;
    }

    public void markSubmitted(Student student) {
        if (!submittedStudents.contains(student)) {
            submittedStudents.add(student);
        }
    }

    public List<Student> getSubmittedStudents() {
        return submittedStudents;
    }
}
