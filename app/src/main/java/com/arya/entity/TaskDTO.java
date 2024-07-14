package com.arya.entity;

import java.util.Date;
import java.util.UUID;

import com.arya.dto.TaskStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "task")
@Data
public class TaskDTO {

    @Id
    private UUID taskId;
    private String task;
    private String description;
    private TaskStatus status;
    private Date dueDate;
}
