package com.app.todoapp.service;

import com.app.todoapp.models.Task;
import com.app.todoapp.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();            // findAll is a predefined method of JpaRepository which returns all the objects of the entity table
    }

    public void createTask(String name) {
        Task task=new Task();
        task.setCompleted(false);
        task.setName(name);
        taskRepository.save(task);
    }
}

// Service class contains all the business logics!