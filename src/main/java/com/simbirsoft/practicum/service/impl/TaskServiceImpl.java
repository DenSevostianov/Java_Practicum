package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.TaskDto;
import com.simbirsoft.practicum.entity.Task;
import com.simbirsoft.practicum.exception.TaskIdNotFoundException;
import com.simbirsoft.practicum.repository.TaskRepository;
import com.simbirsoft.practicum.service.TaskService;
import com.simbirsoft.practicum.service.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class TaskServiceImpl implements TaskService {

    TaskRepository taskRepository;
    TaskMapper taskMapper;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }

    @Override
    public TaskDto createTask(TaskDto taskDto) {
        Task task = taskMapper.toEntity(taskDto);
        taskRepository.saveAndFlush(task);
        return taskMapper.toDto(task);
    }

    @Override
    public List<TaskDto> findAll() {
        return taskRepository.findAll().stream().map(taskMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new TaskIdNotFoundException(id));
        taskRepository.delete(task);

    }
}
