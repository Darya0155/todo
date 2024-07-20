package com.arya.dto;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class Task {
    private UUID taskId;
    private String task;
    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;
    private Date dueDate;
}
