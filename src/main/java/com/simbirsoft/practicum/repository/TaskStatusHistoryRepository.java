package com.simbirsoft.practicum.repository;

import com.simbirsoft.practicum.entity.TaskStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStatusHistoryRepository extends JpaRepository<TaskStatusHistory, Long> {
}
