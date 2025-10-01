package com.ritika.models;

public class Student {
    private String id; // Unique student ID

    // Constructor initializes student ID
    public Student(String id) {
        this.id = id;
    }

    // Get student ID
    public String getId() {
        return id;
    }
}
