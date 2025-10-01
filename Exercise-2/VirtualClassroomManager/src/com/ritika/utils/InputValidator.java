package com.ritika.utils;

public class InputValidator {
    public static void validateNotEmpty(String input, String field) {
        if(input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " cannot be empty.");
        }
    }
}
