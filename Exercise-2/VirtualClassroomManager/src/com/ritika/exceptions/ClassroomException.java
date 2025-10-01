package com.ritika.exceptions;

/**
 * Exception thrown when there is an issue related to classrooms,
 * such as adding a duplicate classroom or referencing a non-existent classroom.
 */
public class ClassroomException extends RuntimeException {

    public ClassroomException() {
        super();
    }

    public ClassroomException(String message) {
        super(message);
    }

    public ClassroomException(String message, Throwable cause) {
        super(message, cause);
    }
}
