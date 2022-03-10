package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.StatusTaskDto;
import com.simbirsoft.practicum.entity.StatusTask;

import java.util.List;

public interface StatusTaskService {

    StatusTaskDto create(StatusTaskDto statusTaskDto);
    List<StatusTaskDto> findAll();
    void delete(Long id);
}
