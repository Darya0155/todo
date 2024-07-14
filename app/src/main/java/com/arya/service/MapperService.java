package com.arya.service;

import java.util.List;
import java.util.UUID;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueCheckStrategy;

import com.arya.dto.Task;
import com.arya.entity.TaskDTO;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperService {

    TaskDTO map(Task task);

    @Mapping(source = "taskId", target = "taskId")
    TaskDTO map(UUID taskId, Task task);

    Task map(TaskDTO taskdto);

    List<TaskDTO> map(List<Task> task);


    List<Task> mapList(List<TaskDTO> tasks);
}
