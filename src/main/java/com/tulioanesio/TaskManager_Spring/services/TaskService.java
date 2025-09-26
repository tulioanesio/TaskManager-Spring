package com.tulioanesio.TaskManager_Spring.services;

import com.tulioanesio.TaskManager_Spring.model.Task;
import com.tulioanesio.TaskManager_Spring.model.dtos.TaskRequestDTO;
import com.tulioanesio.TaskManager_Spring.repositories.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void createTask(TaskRequestDTO taskRequestDTO){
        var entity = new Task(
                taskRequestDTO.Task(),
                taskRequestDTO.isCompleted()
        );

        taskRepository.save(entity);

    }


}
