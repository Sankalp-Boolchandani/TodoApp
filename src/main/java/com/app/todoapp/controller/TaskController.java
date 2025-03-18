package com.app.todoapp.controller;

import com.app.todoapp.models.Task;
import com.app.todoapp.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TaskController {

    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/getTasks")
    private String getTasks(Model model){
        List<Task> tasks=taskService.getAllTasks();
        model.addAttribute("tasks", tasks);             // helps sending the data to the associated html page
        model.addAttribute("pageName", "All tasks");
        return "tasks";             // renders the html thymeleaf template with the name of the string returned
    }

    @PostMapping("/createTask")
    private String createTask(@RequestParam String name){
        taskService.createTask(name);
        return "redirect:/getTasks";             // renders the html thymeleaf template with the name of the string returned
    }

}

// Controller helps as an interface for the request to reach the business logics