package com.simbirsoft.practicum.repository;

import com.simbirsoft.practicum.entity.ProjectStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectStatusHistoryRepository extends JpaRepository<ProjectStatusHistory, Long> {
}
