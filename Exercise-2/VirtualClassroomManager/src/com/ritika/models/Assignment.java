package com.ritika.models;

public class Assignment {
    private String details;
    private boolean isSubmitted;

    public Assignment(String details) {
        this.details = details;
        this.isSubmitted = false;
    }

    public String getDetails() {
        return details;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void submit() {
        this.isSubmitted = true;
    }
}
