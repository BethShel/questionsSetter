package com.example.mvc_demo.controller;

import com.example.mvc_demo.domain.Task;
import com.example.mvc_demo.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private TaskRepo taskRep;


    @GetMapping("/")
    public String greeting(Map<String,Object> model) {
        return "greeting";
    }

    @GetMapping("/main")
    public String main(Map<String,Object> model){
        Iterable<Task> answers = taskRep.findAll();
        model.put("answers",answers);
        return "main";
    }

    @PostMapping("/main")
    public String add(@RequestParam String text, Map<String,Object> model) {
        Task task = new Task(text);

        taskRep.save(task);

        Iterable<Task> answers = taskRep.findAll();
        model.put("answers",answers);
        return "main";
    }

}