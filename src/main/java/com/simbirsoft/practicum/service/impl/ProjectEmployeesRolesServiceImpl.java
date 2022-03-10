package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.ProjectEmployeesRolesDto;
import com.simbirsoft.practicum.entity.ProjectEmployeesRoles;
import com.simbirsoft.practicum.exception.ProjectEmployeesRolesIdNotFoundException;
import com.simbirsoft.practicum.repository.ProjectEmployeesRolesRepository;
import com.simbirsoft.practicum.service.ProjectEmployeesRolesService;
import com.simbirsoft.practicum.service.mapper.ProjectEmployeesRolesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectEmployeesRolesServiceImpl implements ProjectEmployeesRolesService {

    ProjectEmployeesRolesRepository projectEmployeesRolesRepository;
    ProjectEmployeesRolesMapper projectEmployeesRolesMapper;


    @Autowired
    public ProjectEmployeesRolesServiceImpl(ProjectEmployeesRolesRepository projectEmployeesRolesRepository, ProjectEmployeesRolesMapper projectEmployeesRolesMapper) {
        this.projectEmployeesRolesRepository = projectEmployeesRolesRepository;
        this.projectEmployeesRolesMapper = projectEmployeesRolesMapper;
    }

    @Override
    public ProjectEmployeesRolesDto create(ProjectEmployeesRolesDto projectEmployeesRolesDto) {
        ProjectEmployeesRoles projectEmployeesRoles = projectEmployeesRolesMapper.toEntity(projectEmployeesRolesDto);
        projectEmployeesRolesRepository.saveAndFlush(projectEmployeesRoles);
        return projectEmployeesRolesMapper.toDto(projectEmployeesRoles);
    }

    @Override
    public List<ProjectEmployeesRolesDto> findAll() {
        return projectEmployeesRolesRepository.findAll().stream().map(projectEmployeesRolesMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        ProjectEmployeesRoles projectEmployeesRoles = projectEmployeesRolesRepository.findById(id).orElseThrow(() -> new ProjectEmployeesRolesIdNotFoundException(id));
        projectEmployeesRolesRepository.delete(projectEmployeesRoles);
    }
}
