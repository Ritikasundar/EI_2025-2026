package com.ritika.utils;

import java.time.LocalDateTime;

public class LoggerUtil {
    private static LoggerUtil instance;

    private LoggerUtil() {}

    public static LoggerUtil getInstance() {
        if(instance == null) instance = new LoggerUtil();
        return instance;
    }

    public void log(String message) {
        System.out.println(LocalDateTime.now() + " - " + message);
    }
}
