package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.ProjectStatusHistoryDto;
import com.simbirsoft.practicum.entity.ProjectStatusHistory;
import com.simbirsoft.practicum.exception.ProjectStatusHistoryIdNotFoundException;
import com.simbirsoft.practicum.repository.ProjectStatusHistoryRepository;
import com.simbirsoft.practicum.service.ProjectStatusHistoryService;
import com.simbirsoft.practicum.service.mapper.ProjectStatusHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProjectStatusHistoryServiceImpl implements ProjectStatusHistoryService {

    ProjectStatusHistoryRepository projectStatusHistoryRepository;
    ProjectStatusHistoryMapper projectStatusHistoryMapper;

    @Autowired
    public ProjectStatusHistoryServiceImpl(ProjectStatusHistoryRepository projectStatusHistoryRepository, ProjectStatusHistoryMapper projectStatusHistoryMapper) {
        this.projectStatusHistoryRepository = projectStatusHistoryRepository;
        this.projectStatusHistoryMapper = projectStatusHistoryMapper;
    }

    @Override
    public ProjectStatusHistoryDto createProjectStatusHistory(ProjectStatusHistoryDto projectStatusHistoryDto) {
        ProjectStatusHistory projectStatusHistory = projectStatusHistoryMapper.toEntity(projectStatusHistoryDto);
        projectStatusHistoryRepository.saveAndFlush(projectStatusHistory);
        return projectStatusHistoryMapper.toDto(projectStatusHistory);
    }

    @Override
    public List<ProjectStatusHistoryDto> findAll() {
        return projectStatusHistoryRepository.findAll().stream().map(projectStatusHistoryMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        ProjectStatusHistory projectStatusHistory = projectStatusHistoryRepository.findById(id).orElseThrow(() -> new ProjectStatusHistoryIdNotFoundException(id));
        projectStatusHistoryRepository.delete(projectStatusHistory);
    }
}
