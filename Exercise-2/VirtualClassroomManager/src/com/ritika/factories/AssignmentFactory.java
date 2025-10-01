package com.ritika.factories;

import com.ritika.models.Assignment;

public class AssignmentFactory {

    // Create a new assignment using provided ID and details
    public static Assignment createAssignment(String id, String details) {
        return new Assignment(id, details);
    }
}
