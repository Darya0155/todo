package com.arya.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.arya.dto.Task;
import com.arya.repo.TaskRepo;

public class TodoServiceImpl implements TodoService {

    @Autowired
    TaskRepo taskRepo;

    @Override
    public Task createTask(Task task) {

        return null;
    }

    @Override
    public List<Task> getAll() {

        return List.of();
    }

    @Override
    public Task findById(UUID id) {

        return null;
    }

    @Override
    public Boolean deleteById(UUID id) {

        return null;
    }
}
