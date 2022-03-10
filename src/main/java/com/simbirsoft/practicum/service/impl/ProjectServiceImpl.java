package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.ProjectDto;
import com.simbirsoft.practicum.entity.Project;
import com.simbirsoft.practicum.exception.ProjectIdNotFoundException;
import com.simbirsoft.practicum.repository.ProjectRepository;
import com.simbirsoft.practicum.service.ProjectService;
import com.simbirsoft.practicum.service.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {


    ProjectRepository projectRepository;
    ProjectMapper projectMapper;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.projectMapper = projectMapper;
    }

    public ProjectServiceImpl() {
    }

    @Override
    public ProjectDto createProject(ProjectDto projectDto) {
        Project project = projectMapper.toEntity(projectDto);
        projectRepository.saveAndFlush(project);
        return projectMapper.toDto(project);
    }

    @Override
    public List<ProjectDto> findAll() {
        projectRepository.findAll().stream().map(projectMapper::toDto).collect(Collectors.toList());
        return null;
    }

    @Override
    public void delete(Long id) {
        Project project = projectRepository.findById(id).orElseThrow(() -> new ProjectIdNotFoundException(id));
        projectRepository.delete(project);
    }
}
