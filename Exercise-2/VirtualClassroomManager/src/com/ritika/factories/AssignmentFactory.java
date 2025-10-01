package com.ritika.factories;

import com.ritika.models.Assignment;

public class AssignmentFactory {
    public static Assignment createAssignment(String details) {
        return new Assignment(details);
    }
}
