package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.StatusDto;
import com.simbirsoft.practicum.dto.TaskDto;

import java.util.List;

public interface StatusService {

    StatusDto createStatus(StatusDto statusDto);
    List<StatusDto> findAll();
    void delete(Long id);
}
