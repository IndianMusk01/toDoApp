package com.app.toDoApp.controller;

import org.springframework.ui.Model;
import com.app.toDoApp.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String getTasks(Model model) {
        List tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";  // Thymeleaf template name
    }

    @PostMapping("/")
    public String createTask(@RequestParam String title) {
        taskService.createTask(title);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }

    @PostMapping("/toggle/{id}")
    public String toggleTask(@PathVariable Long id) {
        taskService.toggleTask(id);
        return "redirect:/";
    }
}
