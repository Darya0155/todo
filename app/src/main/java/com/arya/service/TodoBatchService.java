package com.arya.service;

import com.arya.dto.Task;

import java.util.List;
import java.util.UUID;

public interface TodoBatchService {
    List<Task> createTasks(List<Task> task);

    Boolean deleteByIds(List<UUID> id);
}
