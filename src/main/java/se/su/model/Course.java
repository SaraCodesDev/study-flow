package se.su.model;

import java.util.*;

public class Course {

    private UUID id;
    private String name;
    private List<Task> tasks;

    public Course(String name) {
        this.id = UUID.randomUUID();
        this.tasks = new ArrayList<>();
        setName(name);
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public List<Task> getTasks() {
        return Collections.unmodifiableList(tasks);
    }

    public void setName(String newName) {
        if (newName == null ||newName.isBlank()){
            throw new IllegalArgumentException("Course name cannot be empty");
        }
        this.name = newName;
    }

    public void addTask(Task task) {
        if (task == null){
            throw new IllegalArgumentException("Task cannot be null");
        }
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

}
