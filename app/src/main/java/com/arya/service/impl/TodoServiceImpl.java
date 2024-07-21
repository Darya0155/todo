package com.arya.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arya.dto.Task;
import com.arya.entity.TaskDTO;
import com.arya.repo.TaskRepo;
import com.arya.service.MapperService;
import com.arya.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    TaskRepo taskRepo;

    @Autowired
    MapperService mapperService;

    @Override
    public Task createTask(Task task) {
        TaskDTO taskDTO = mapperService.map(UUID.randomUUID(), task);
        TaskDTO savedTaskDto = taskRepo.save(taskDTO);
        return mapperService.map(savedTaskDto);
    }

    @Override
    public List<Task> getAll() {
        return mapperService.mapList(taskRepo.findAll());
    }

    @Override
    public Task findById(UUID id) {

        Optional<TaskDTO> task = taskRepo.findById(id);
        return task.map(taskDTO -> mapperService.map(taskDTO)).orElse(null);
    }

    @Override
    public Boolean deleteById(UUID id) {
        taskRepo.deleteById(id);
        return true;
    }
}
