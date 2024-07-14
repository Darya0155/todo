package com.arya.service;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueCheckStrategy;

import com.arya.dto.Task;
import com.arya.entity.TaskDTO;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperService {

    TaskDTO map(Task task);

    Task map(TaskDTO taskdto);
}
