package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.TaskStatusHistoryDto;

import java.util.List;

public interface TaskStatusHistoryService {

    TaskStatusHistoryDto create(TaskStatusHistoryDto taskStatusHistoryDto);
    List<TaskStatusHistoryDto> findAll();
    void delete(Long id);
}
