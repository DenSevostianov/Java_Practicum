package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.StatusDto;
import com.simbirsoft.practicum.entity.Status;
import com.simbirsoft.practicum.exception.StatusIdNotFoundException;
import com.simbirsoft.practicum.repository.StatusRepository;
import com.simbirsoft.practicum.service.StatusService;
import com.simbirsoft.practicum.service.mapper.StatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StatusServiceImpl implements StatusService {

    StatusRepository statusRepository;
    StatusMapper statusMapper;

    @Autowired
    public StatusServiceImpl(StatusRepository statusRepository, StatusMapper statusMapper) {
        this.statusRepository = statusRepository;
        this.statusMapper = statusMapper;
    }

    @Override
    public StatusDto createStatus(StatusDto statusDto) {
        Status status = statusMapper.toEntity(statusDto);
        statusRepository.saveAndFlush(status);
        return statusMapper.toDto(status);
    }

    @Override
    public List<StatusDto> findAll() {
        return statusRepository.findAll().stream().map(statusMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        Status status = statusRepository.findById(id).orElseThrow(() -> new StatusIdNotFoundException(id));
    }
}
