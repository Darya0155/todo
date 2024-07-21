package com.arya.service;

import java.util.List;
import java.util.UUID;

import com.arya.dto.Task;

public interface TodoBatchService {
    List<Task> createTasks(List<Task> task);

    Boolean deleteByIds(List<UUID> id);
}
