package com.app.todoapp.controller;

import org.springframework.stereotype.Controller;

import com.app.todoapp.services.TaskService;

@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
}
