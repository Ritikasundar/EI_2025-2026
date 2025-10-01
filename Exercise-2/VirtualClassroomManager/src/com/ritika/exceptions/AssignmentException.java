package com.ritika.exceptions;

/**
 * Exception thrown when there is an issue related to assignments,
 * such as scheduling a duplicate assignment or submitting a non-existent assignment.
 */
public class AssignmentException extends RuntimeException {

    public AssignmentException() {
        super();
    }

    public AssignmentException(String message) {
        super(message);
    }

    public AssignmentException(String message, Throwable cause) {
        super(message, cause);
    }
}
