package com.arya.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arya.entity.TaskDTO;

@Repository
public interface TaskRepo extends JpaRepository<TaskDTO, UUID> {
}
