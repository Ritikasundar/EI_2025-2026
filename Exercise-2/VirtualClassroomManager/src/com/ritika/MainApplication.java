package com.ritika;

import com.ritika.controllers.ClassroomController;
import com.ritika.controllers.StudentController;
import com.ritika.controllers.AssignmentController;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassroomController classroomController = new ClassroomController();
        StudentController studentController = new StudentController(classroomController);
        AssignmentController assignmentController = new AssignmentController(classroomController, studentController);

        boolean running = true;

        System.out.println("===== Welcome to Virtual Classroom Manager =====");

        while (running) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add Classroom");
            System.out.println("2. Add Student");
            System.out.println("3. Schedule Assignment");
            System.out.println("4. Submit Assignment");
            System.out.println("5. List Classrooms");
            System.out.println("6. Exit");
            System.out.println("7. Remove Classroom");
            System.out.println("8. View Students in a Classroom"); // ✅ new option

            System.out.print("Enter your choice (1-8): ");
            String input = scanner.nextLine().trim();

            try {
                switch (input) {
                    case "1":
                        System.out.print("Enter classroom name: ");
                        String className = scanner.nextLine().trim();
                        classroomController.addClassroom(className);
                        break;

                    case "2":
                        System.out.print("Enter student ID: ");
                        String studentId = scanner.nextLine().trim();
                        System.out.print("Enter classroom name: ");
                        String classNameForStudent = scanner.nextLine().trim();
                        studentController.addStudent(studentId, classNameForStudent);
                        break;

                    case "3":
                        System.out.print("Enter classroom name: ");
                        String classNameForAssignment = scanner.nextLine().trim();
                        System.out.print("Enter assignment details: ");
                        String assignmentDetails = scanner.nextLine().trim();
                        assignmentController.scheduleAssignment(classNameForAssignment, assignmentDetails);
                        break;

                    case "4":
                        System.out.print("Enter student ID: ");
                        String studentIdSubmit = scanner.nextLine().trim();
                        System.out.print("Enter classroom name: ");
                        String classNameSubmit = scanner.nextLine().trim();
                        System.out.print("Enter assignment details: ");
                        String assignmentDetailsSubmit = scanner.nextLine().trim();
                        assignmentController.submitAssignment(studentIdSubmit, classNameSubmit, assignmentDetailsSubmit);
                        break;

                    case "5":
                        classroomController.listClassrooms();
                        break;

                    case "6":
                        System.out.println("Exiting... Goodbye!");
                        running = false;
                        break;

                    case "7":
                        System.out.print("Enter classroom name to remove: ");
                        String classNameToRemove = scanner.nextLine().trim();
                        classroomController.removeClassroom(classNameToRemove);
                        break;

                    case "8": 
                        System.out.print("Enter classroom name to view students: ");
                        String classNameForView = scanner.nextLine().trim();
                        studentController.listStudents(classNameForView);
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
