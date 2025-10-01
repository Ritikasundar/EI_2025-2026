# EXERCISE 2

# Virtual Classroom Manager

## Use Case Overview

The Virtual Classroom Manager is a terminal-based application designed to manage a virtual classroom environment for an EdTech platform. It enables administrators and teachers to create and manage classrooms, enroll students, schedule assignments, and track student submissions. The system is designed to be robust, maintainable, and adheres to software engineering best practices.

### Functionalities

- **Classroom Management**: Add, remove, and list virtual classrooms. Prevents duplicate classrooms.  
- **Student Management**: Enroll students into classrooms, list students, and prevent duplicate enrollment.  
- **Assignment Management**: Schedule assignments with unique IDs, prevent duplicate assignments, allow students to submit assignments, and prevent duplicate submissions. View submissions by student.  
- **Logging and Monitoring**: Logs all operations to a file (`log.txt`) and provides the option to print logs in the terminal.  
- **Input Validation**: Ensures that user inputs are valid and handles invalid inputs gracefully.  
- **Exception Handling**: Custom exceptions (`ClassroomException`, `StudentException`, `AssignmentException`) are used to handle domain-specific errors.

---

## Design Patterns Used

### 1. Factory Pattern
- **Purpose**: Encapsulates creation of assignments and allows future extension for different types of assignments.  
- **Classes Involved**: `AssignmentFactory.java`  

### 2. Singleton Pattern
- **Purpose**: Ensures a single instance for logging across the application, centralizing logging operations.  
- **Classes Involved**: `LoggerUtil.java`  

### 3. Controller-Service-Model Separation
- **Purpose**: Separates concerns between Controllers (handling user input), Services (business logic), and Models (data structures).  
- **Classes Involved**:  
  - Controllers: `ClassroomController.java`, `StudentController.java`, `AssignmentController.java`  
  - Services: `ClassroomService.java`, `StudentService.java`, `AssignmentService.java`  
  - Models: `Classroom.java`, `Student.java`, `Assignment.java`  

### 4. Custom Exception Pattern
- **Purpose**: Handles domain-specific errors cleanly, making debugging and logging precise.  
- **Classes Involved**: `AssignmentException.java`, `ClassroomException.java`, `StudentException.java`  

### 5. Dependency Injection (Constructor Injection)
- **Purpose**: Decouples classes by injecting dependencies via constructors instead of hardcoding them.  
- **Classes Involved**: Controllers receiving services via constructor.

---

## Classes and Their Responsibilities

- **MainApplication.java**: Entry point for user interaction and command execution.  
- **Classroom.java**: Represents a classroom; holds students and assignments.  
- **Student.java**: Represents a student entity with a unique ID.  
- **Assignment.java**: Represents an assignment with unique ID and submission tracking.  
- **AssignmentFactory.java**: Factory class to create assignments.  
- **ClassroomController.java / StudentController.java / AssignmentController.java**: Handle user input and interact with services.  
- **ClassroomService.java / StudentService.java / AssignmentService.java**: Implement business logic and validations.  
- **LoggerUtil.java**: Logs all actions to `log.txt` and prints logs to console.  
- **InputValidator.java**: Validates user inputs.  
- **ClassroomException.java / StudentException.java / AssignmentException.java**: Custom exceptions for domain-specific errors.  

---

## Compiling and Executing

1. **Compile all Java files into `bin` folder**:
javac -d ../bin src/com/ritika/**/*.java

2. **Run the application**:
java -cp ../bin com.ritika.MainApplication


---

## Tech Stack

### Programming Language
- Java: Fully object-oriented implementation using design patterns.

### JDK Version
- JDK 17: Provides stable and modern Java features for development.

### Build and Execution
- Java Compiler (`javac`) to compile the source code.  
- Java Runtime (`java`) to execute the compiled bytecode.

### Version Control
- Git: For tracking changes, collaboration, and project management.

---

## Logging
- **Log File Location**: `log.txt` in the project root.  
- Contains timestamped entries for all operations such as creation, enrollment, assignment scheduling, and submissions.  

---

## Contact Information
- Gmail: ritikasundar23012004@gmail.com  
- GitHub: [ritikasundar](https://github.com/ritikasundar)
