package com.arya.rest;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arya.aop.TrackTimeAop;
import com.arya.dto.Task;
import com.arya.service.TodoBatchService;

@RestController
public class TodoBatchController {

    @Autowired
    TodoBatchService todoService;

    @PostMapping("tasks")
    @TrackTimeAop
    public ResponseEntity<List<Task>> createTasks(@RequestBody List<Task> task) {
        ResponseEntity<List<Task>> responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        List<Task> tasks = todoService.createTasks(task);
        if (Objects.nonNull(tasks) && !tasks.isEmpty()) {
            responseEntity = new ResponseEntity<>(tasks, HttpStatus.OK);
        }
        return responseEntity;
    }


    @DeleteMapping("tasks/{ids}")
    @TrackTimeAop
    public ResponseEntity<?> deleteByIds(@PathVariable List<UUID> ids) {
        ResponseEntity<?> responseEntity = new ResponseEntity(HttpStatus.BAD_REQUEST);
        if (todoService.deleteByIds(ids)) {
            responseEntity = new ResponseEntity<>(HttpStatus.OK);
        }
        return responseEntity;
    }
}
