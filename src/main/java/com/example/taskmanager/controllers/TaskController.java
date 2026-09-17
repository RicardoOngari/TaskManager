package com.example.taskmanager.controllers;

import com.example.taskmanager.models.Task;
import com.example.taskmanager.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/task")
public class TaskController {

    private TaskService taskService = new TaskService();

    @GetMapping("")
    public String index(Model model) {

        var tasks = taskService.getAllTask();

        model.addAttribute("tarefas", tasks);

        return "index";
    }

    @GetMapping("/new")
    public String criarTarefa(Model model) {

        model.addAttribute("tarefa", new Task());

        return "criarTarefa";
    }

    @PostMapping("")
    public String salvarTarefa(
            @Valid @ModelAttribute("tarefa") Task tarefa,
            BindingResult result) {

        if (result.hasErrors()) {
            return "criarTarefa";
        }

        tarefa.setId(new Random().nextInt());

        taskService.addTask(tarefa);

        return "redirect:/task";
    }
}
