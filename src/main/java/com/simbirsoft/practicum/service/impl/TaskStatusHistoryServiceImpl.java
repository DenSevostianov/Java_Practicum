package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.ProjectStatusHistoryDto;
import com.simbirsoft.practicum.dto.TaskStatusHistoryDto;
import com.simbirsoft.practicum.entity.ProjectStatusHistory;
import com.simbirsoft.practicum.entity.TaskStatusHistory;
import com.simbirsoft.practicum.exception.ProjectStatusHistoryIdNotFoundException;
import com.simbirsoft.practicum.exception.TaskStatusHistoryIdNotFoundException;
import com.simbirsoft.practicum.repository.TaskStatusHistoryRepository;
import com.simbirsoft.practicum.service.TaskStatusHistoryService;
import com.simbirsoft.practicum.service.mapper.TaskStatusHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskStatusHistoryServiceImpl implements TaskStatusHistoryService {

    TaskStatusHistoryRepository taskStatusHistoryRepository;
    TaskStatusHistoryMapper taskStatusHistoryMapper;

    @Autowired
    public TaskStatusHistoryServiceImpl(TaskStatusHistoryRepository taskStatusHistoryRepository, TaskStatusHistoryMapper taskStatusHistoryMapper) {
        this.taskStatusHistoryRepository = taskStatusHistoryRepository;
        this.taskStatusHistoryMapper = taskStatusHistoryMapper;
    }

    @Override
    public TaskStatusHistoryDto create(TaskStatusHistoryDto taskStatusHistoryDto) {
        TaskStatusHistory taskStatusHistory = taskStatusHistoryMapper.toEntity(taskStatusHistoryDto);
        taskStatusHistoryRepository.saveAndFlush(taskStatusHistory);
        return taskStatusHistoryMapper.toDto(taskStatusHistory);
    }

    @Override
    public List<TaskStatusHistoryDto> findAll() {
        return taskStatusHistoryRepository.findAll().stream().map(taskStatusHistoryMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        TaskStatusHistory taskStatusHistory = taskStatusHistoryRepository.findById(id).orElseThrow(() -> new TaskStatusHistoryIdNotFoundException(id));
        taskStatusHistoryRepository.delete(taskStatusHistory);
    }
}
