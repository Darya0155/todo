package com.arya.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arya.dto.Task;

@RestController
public class TodoController {

    @PostMapping("task")
    public void createTask(@RequestBody Task task) {

    }

    @GetMapping("task")
    public void getAll() {

    }
}
