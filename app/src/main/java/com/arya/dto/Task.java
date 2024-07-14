package com.arya.dto;

import java.util.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class Task {
    private UUID taskId;
    private String task;
    private String description;
    private TaskStatus status;
    private Date dueDate;
}
