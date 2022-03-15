package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.ProjectStatusHistoryDto;

import java.util.List;

public interface ProjectStatusHistoryService {

    ProjectStatusHistoryDto createProjectStatusHistory(ProjectStatusHistoryDto projectStatusHistoryDto);
    List<ProjectStatusHistoryDto> findAll();
    void delete(Long id);
}
