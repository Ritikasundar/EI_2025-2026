package com.ritika; 

import com.ritika.controllers.ClassroomController;
import com.ritika.controllers.StudentController;
import com.ritika.controllers.AssignmentController;
import com.ritika.utils.InputValidator;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassroomController classroomController = new ClassroomController();
        StudentController studentController = new StudentController(classroomController);
        AssignmentController assignmentController = new AssignmentController(classroomController);

        boolean running = true;

        System.out.println("===== Welcome to Virtual Classroom Manager =====");

        while (running) {
            // Display menu options
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add Classroom");
            System.out.println("2. Add Student");
            System.out.println("3. Schedule Assignment");
            System.out.println("4. Submit Assignment");
            System.out.println("5. List Classrooms");
            System.out.println("6. Remove Classroom");
            System.out.println("7. View Students in a Classroom");
            System.out.println("8. View Assignment Submission Status");
            System.out.println("9. Print Logs");
            System.out.println("10. Exit"); 

            System.out.print("Enter your choice (1-10): ");
            String input = scanner.nextLine().trim();

            try {
                switch (input) {
                    case "1":  // Add a new classroom
                        System.out.print("Enter classroom name: ");
                        String className = scanner.nextLine().trim();
                        if (!InputValidator.isValidString(className)) {
                            System.out.println("Invalid classroom name!");
                            break;
                        }
                        classroomController.addClassroom(className);
                        break;

                    case "2":  // Add a new student
                        System.out.print("Enter student ID: ");
                        String studentId = scanner.nextLine().trim();
                        if (!InputValidator.isValidId(studentId)) {
                            System.out.println("Invalid student ID!");
                            break;
                        }
                        System.out.print("Enter classroom name: ");
                        String classNameForStudent = scanner.nextLine().trim();
                        if (!InputValidator.isValidString(classNameForStudent)) {
                            System.out.println("Invalid classroom name!");
                            break;
                        }
                        studentController.addStudent(studentId, classNameForStudent);
                        break;

                    case "3":  // Schedule a new assignment
                        System.out.print("Enter classroom name: ");
                        String classNameForAssignment = scanner.nextLine().trim();
                        if (!InputValidator.isValidString(classNameForAssignment)) {
                            System.out.println("Invalid classroom name!");
                            break;
                        }
                        System.out.print("Enter assignment ID: ");
                        String assignmentId = scanner.nextLine().trim();
                        if (!InputValidator.isValidId(assignmentId)) {
                            System.out.println("Invalid assignment ID!");
                            break;
                        }
                        System.out.print("Enter assignment details: ");
                        String assignmentDetails = scanner.nextLine().trim();
                        if (!InputValidator.isValidString(assignmentDetails)) {
                            System.out.println("Invalid assignment details!");
                            break;
                        }
                        assignmentController.scheduleAssignment(classNameForAssignment, assignmentId, assignmentDetails);
                        break;

                    case "4":  // Submit an assignment
                        System.out.print("Enter student ID: ");
                        String studentIdSubmit = scanner.nextLine().trim();
                        if (!InputValidator.isValidId(studentIdSubmit)) {
                            System.out.println("Invalid student ID!");
                            break;
                        }
                        System.out.print("Enter classroom name: ");
                        String classNameSubmit = scanner.nextLine().trim();
                        if (!InputValidator.isValidString(classNameSubmit)) {
                            System.out.println("Invalid classroom name!");
                            break;
                        }
                        System.out.print("Enter assignment ID: ");
                        String assignmentIdSubmit = scanner.nextLine().trim();
                        if (!InputValidator.isValidId(assignmentIdSubmit)) {
                            System.out.println("Invalid assignment ID!");
                            break;
                        }
                        assignmentController.submitAssignment(studentIdSubmit, classNameSubmit, assignmentIdSubmit);
                        break;

                    case "5":  // List all classrooms
                        classroomController.listClassrooms();
                        break;

                    case "6":  // Remove a classroom
                        System.out.print("Enter classroom name to remove: ");
                        String classNameToRemove = scanner.nextLine().trim();
                        if (!InputValidator.isValidString(classNameToRemove)) {
                            System.out.println("Invalid classroom name!");
                            break;
                        }
                        classroomController.removeClassroom(classNameToRemove);
                        break;

                    case "7":  // View students in a classroom
                        System.out.print("Enter classroom name to view students: ");
                        String classNameForView = scanner.nextLine().trim();
                        if (!InputValidator.isValidString(classNameForView)) {
                            System.out.println("Invalid classroom name!");
                            break;
                        }
                        studentController.listStudents(classNameForView);
                        break;

                    case "8":  // View assignment submission status
                        System.out.print("Enter classroom name: ");
                        String classNameAssignmentStatus = scanner.nextLine().trim();
                        if (!InputValidator.isValidString(classNameAssignmentStatus)) {
                            System.out.println("Invalid classroom name!");
                            break;
                        }
                        System.out.print("Enter assignment ID: ");
                        String assignmentIdStatus = scanner.nextLine().trim();
                        if (!InputValidator.isValidId(assignmentIdStatus)) {
                            System.out.println("Invalid assignment ID!");
                            break;
                        }
                        assignmentController.viewAssignmentSubmissions(classNameAssignmentStatus, assignmentIdStatus);
                        break;

                    case "9":  // Print logs
                        assignmentController.printLogs();
                        break;

                    case "10":  // Exit application
                        System.out.println("Exiting... Goodbye!");
                        running = false;
                        break;

                    default:  // Invalid menu option
                        System.out.println("Invalid choice. Please enter a number between 1 and 10.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage()); // Catch all exceptions for user feedback
            }
        }

        scanner.close(); 
    }
}
