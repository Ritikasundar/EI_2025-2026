package com.ritika.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerUtil {

    private static final String LOG_FILE = "log.txt";
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Log message to file with timestamp
    public static synchronized void log(String message) {
        String timestampedMessage = "[" + LocalDateTime.now().format(dtf) + "] " + message;
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(timestampedMessage);
        } catch (IOException e) {
            System.out.println("Logging failed: " + e.getMessage());
        }
    }

    // Print log to console
    public static synchronized void printLog() {
        try (java.util.Scanner scanner = new java.util.Scanner(new java.io.File(LOG_FILE))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Unable to read log file: " + e.getMessage());
        }
    }
}
