package com.ritika.utils;

public class InputValidator {

    // Check if a string is null or empty
    public static boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty();
    }

    // Check if ID contains only letters/digits
    public static boolean isValidId(String id) {
        return isValidString(id) && id.matches("[A-Za-z0-9_-]+");
    }
}
