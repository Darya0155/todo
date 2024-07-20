package com.arya.service.impl;

import com.arya.dto.Task;
import com.arya.entity.TaskDTO;
import com.arya.repo.TaskRepo;
import com.arya.service.MapperService;
import com.arya.service.TodoBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TodoBatchServiceImpl implements TodoBatchService {

    @Autowired
    TaskRepo taskRepo;

    @Autowired
    MapperService mapperService;

    @Override
    public List<Task> createTasks(List<Task> tasks) {
        List<TaskDTO> taskDTOList = tasks.stream().map(task -> mapperService.map(UUID.randomUUID(), task)).toList();
        List<TaskDTO> savedTaskDto = taskRepo.saveAll(taskDTOList);
        return mapperService.mapList(savedTaskDto);
    }

    @Override
    public Boolean deleteByIds(List<UUID> ids) {
        taskRepo.deleteAllByIdInBatch(ids);
        return true;
    }
}
