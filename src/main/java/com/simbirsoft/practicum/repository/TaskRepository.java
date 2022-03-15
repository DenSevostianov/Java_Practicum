package com.simbirsoft.practicum.repository;

import com.simbirsoft.practicum.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
