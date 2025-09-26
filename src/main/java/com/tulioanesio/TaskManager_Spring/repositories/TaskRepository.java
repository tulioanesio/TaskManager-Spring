package com.tulioanesio.TaskManager_Spring.repositories;

import com.tulioanesio.TaskManager_Spring.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
