package com.ritika.services;

import com.ritika.models.Classroom;
import com.ritika.exceptions.ClassroomException;
import java.util.HashMap;
import java.util.Map;

public class ClassroomService {
    private Map<String, Classroom> classrooms;

    public ClassroomService() {
        classrooms = new HashMap<>();
    }

    public void addClassroom(String name) {
        if(classrooms.containsKey(name)) {
            throw new ClassroomException("Classroom already exists.");
        }
        classrooms.put(name, new Classroom(name));
    }

    public Classroom getClassroom(String name) {
        if(!classrooms.containsKey(name)) {
            throw new ClassroomException("Classroom not found.");
        }
        return classrooms.get(name);
    }

    public void listClassrooms() {
        if(classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        classrooms.keySet().forEach(System.out::println);
    }

    public void removeClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            throw new ClassroomException("Cannot remove. Classroom not found: " + className);
        }
        classrooms.remove(className);
    }
}
