package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.StatusTaskDto;
import com.simbirsoft.practicum.entity.StatusTask;
import com.simbirsoft.practicum.exception.StatusTaskIdNotFoundException;
import com.simbirsoft.practicum.repository.StatusTaskRepository;
import com.simbirsoft.practicum.service.StatusTaskService;
import com.simbirsoft.practicum.service.mapper.StatusTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatusTaskServiceImpl implements StatusTaskService {

    StatusTaskRepository statusTaskRepository;
    StatusTaskMapper statusTaskMapper;

    @Autowired
    public StatusTaskServiceImpl(StatusTaskRepository statusTaskRepository, StatusTaskMapper statusTaskMapper) {
        this.statusTaskRepository = statusTaskRepository;
        this.statusTaskMapper = statusTaskMapper;
    }

    @Override
    public StatusTaskDto create(StatusTaskDto statusTaskDto) {
        StatusTask statusTask = statusTaskMapper.toEntity(statusTaskDto);
        statusTaskRepository.saveAndFlush(statusTask);
        return statusTaskMapper.toDto(statusTask);
    }

    @Override
    public List<StatusTaskDto> findAll() {
        return statusTaskRepository.findAll().stream().map(statusTaskMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        StatusTask statusTask = statusTaskRepository.findById(id).orElseThrow(() -> new StatusTaskIdNotFoundException(id));
    }
}
