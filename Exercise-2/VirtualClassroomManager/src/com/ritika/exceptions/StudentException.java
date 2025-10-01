package com.ritika.exceptions;

/**
 * Exception thrown when there is an issue related to students,
 * such as enrolling a duplicate student or referencing a non-existent student.
 */
public class StudentException extends RuntimeException {

    public StudentException() {
        super();
    }

    public StudentException(String message) {
        super(message);
    }

    public StudentException(String message, Throwable cause) {
        super(message, cause);
    }
}
