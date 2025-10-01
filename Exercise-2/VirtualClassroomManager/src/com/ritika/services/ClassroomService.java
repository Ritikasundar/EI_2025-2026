package com.ritika.services;

import com.ritika.models.Classroom;
import com.ritika.exceptions.ClassroomException;
import java.util.HashMap;
import java.util.Map;

public class ClassroomService {
    private Map<String, Classroom> classrooms; // Stores classrooms by name

    // Constructor initializes the classroom map
    public ClassroomService() {
        classrooms = new HashMap<>();
    }

    // Add a new classroom; throws exception if already exists
    public void addClassroom(String name) {
        if(classrooms.containsKey(name)) {
            throw new ClassroomException("Classroom already exists.");
        }
        classrooms.put(name, new Classroom(name));
    }

    // Retrieve a classroom by name; throws exception if not found
    public Classroom getClassroom(String name) {
        if(!classrooms.containsKey(name)) {
            throw new ClassroomException("Classroom not found.");
        }
        return classrooms.get(name);
    }

    // List all classrooms
    public void listClassrooms() {
        if(classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        classrooms.keySet().forEach(System.out::println);
    }

    // Remove a classroom; throws exception if not found
    public void removeClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            throw new ClassroomException("Cannot remove. Classroom not found: " + className);
        }
        classrooms.remove(className);
    }
}
