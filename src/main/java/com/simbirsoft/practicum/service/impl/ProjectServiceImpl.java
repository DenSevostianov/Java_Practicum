package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.ProjectRequestDto;
import com.simbirsoft.practicum.dto.ProjectResponseDto;
import com.simbirsoft.practicum.entity.Project;
import com.simbirsoft.practicum.exception.ProjectIdNotFoundException;
import com.simbirsoft.practicum.repository.ProjectRepository;
import com.simbirsoft.practicum.service.ProjectService;
import com.simbirsoft.practicum.service.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public ProjectResponseDto createProject(ProjectRequestDto projectRequestDto) {
        Project project = projectMapper.toEntity(projectRequestDto);
        projectRepository.saveAndFlush(project);
        return projectMapper.toDto(project);
    }

    @Override
    public List<ProjectResponseDto> findAll() {
        return projectRepository.findAll().stream().map(projectMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public ProjectResponseDto findById(Long id) {
        Project project = projectRepository.findById(id).orElseThrow(() -> new ProjectIdNotFoundException(id));
        return projectMapper.toDto(project);
    }

    @Override
    public ProjectResponseDto update(ProjectRequestDto projectRequestDto) {
        Project project = projectMapper.toEntity(projectRequestDto);
        projectRepository.saveAndFlush(project);
        return projectMapper.toDto(project);
    }

    @Override
    public void delete(Long id) {
        Project project = projectRepository.findById(id).orElseThrow(() -> new ProjectIdNotFoundException(id));
        projectRepository.delete(project);
    }
}
