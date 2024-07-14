package com.arya.service;

import java.util.List;
import java.util.UUID;

import com.arya.dto.Task;

public interface TodoService {
    Task createTask(Task task);

    List<Task> getAll();

    Task findById(UUID id);

    Boolean deleteById(UUID id);
}
