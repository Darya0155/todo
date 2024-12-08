package com.arya.rest;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arya.aop.TrackTimeAop;
import com.arya.dto.Task;
import com.arya.service.TodoService;

@RestController
public class TodoController {

    @Autowired
    TodoService todoService;

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @PostMapping("task")
    @TrackTimeAop
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        ResponseEntity<Task> responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        Task savedTask = todoService.createTask(task);
        if (Objects.nonNull(savedTask)) {
            responseEntity = new ResponseEntity<>(savedTask, HttpStatus.OK);
        }
        return responseEntity;
    }

    @GetMapping("task")
    @TrackTimeAop
    public ResponseEntity<List<Task>> getAll() {
        ResponseEntity<List<Task>> responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        List<Task> tasks = todoService.getAll();
        if (Objects.nonNull(tasks) && !tasks.isEmpty()) {
            responseEntity = new ResponseEntity<>(tasks, HttpStatus.OK);
        }
        return responseEntity;
    }

    @GetMapping("task/{id}")
    @TrackTimeAop
    public ResponseEntity<Task> getById(@PathVariable UUID id) {
        ResponseEntity<Task> responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        Task task = todoService.findById(id);
        if (Objects.nonNull(task)) {
            responseEntity = new ResponseEntity<>(task, HttpStatus.OK);
        }
        return responseEntity;
    }

    @DeleteMapping("task/{id}")
    @TrackTimeAop
    public ResponseEntity<?> deleteById(@PathVariable UUID id) {
        ResponseEntity<?> responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
        if (todoService.deleteById(id)) {
            responseEntity = new ResponseEntity<>(HttpStatus.OK);
        }
        return responseEntity;
    }
}
