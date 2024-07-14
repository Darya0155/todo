package com.arya.rest;

import com.arya.aop.TrackTimeAop;
import com.arya.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arya.dto.Task;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @PostMapping("task")
    @TrackTimeAop
    public Task createTask(@RequestBody Task task) {
        return todoService.createTask(task);
    }

    @GetMapping("task")
    @TrackTimeAop
    public List<Task> getAll() {
        return todoService.getAll();
    }
}
