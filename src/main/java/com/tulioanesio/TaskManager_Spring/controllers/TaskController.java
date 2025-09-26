package com.tulioanesio.TaskManager_Spring.controllers;

import com.tulioanesio.TaskManager_Spring.model.Task;
import com.tulioanesio.TaskManager_Spring.model.dtos.TaskRequestDTO;
import com.tulioanesio.TaskManager_Spring.services.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody TaskRequestDTO request){

    }
}
