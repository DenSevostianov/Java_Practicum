package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.TaskDto;
import com.simbirsoft.practicum.entity.Task;

import java.util.List;

public interface TaskService {

    TaskDto createTask(TaskDto taskDto);
    List<TaskDto> findAll();
    void delete(Long id);
}
