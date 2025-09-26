package com.tulioanesio.TaskManager_Spring.model;

import jakarta.persistence.*;

@Entity(name = "task")
@Table(name = "task", schema = "public")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String Task;
    Boolean isCompleted;

    public Task() {
    }

    public Task(Long id, String task, Boolean isCompleted) {
        this.id = id;
        Task = task;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }
}


