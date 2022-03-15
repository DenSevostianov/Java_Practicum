package com.simbirsoft.practicum.service.mapper;
import com.simbirsoft.practicum.dto.ProjectRequestDto;
import com.simbirsoft.practicum.dto.ProjectResponseDto;
import com.simbirsoft.practicum.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class ProjectMapper {

    ProjectStatusHistoryMapper projectStatusHistoryMapper;
    ProjectEmployeesRolesMapper projectEmployeesRolesMapper;

    @Autowired
    public ProjectMapper(ProjectStatusHistoryMapper projectStatusHistoryMapper, ProjectEmployeesRolesMapper projectEmployeesRolesMapper) {
        this.projectStatusHistoryMapper = projectStatusHistoryMapper;
        this.projectEmployeesRolesMapper = projectEmployeesRolesMapper;
    }

    public Project toEntity(ProjectRequestDto projectRequestDto){
        Project project = new Project(
                projectRequestDto.getId(),
                projectRequestDto.getName(),
                projectRequestDto.getDescription(),
                projectRequestDto.getProjectStatusHistoriesDtoSet().stream().map(projectStatusHistoryMapper::toEntity).collect(Collectors.toSet()),
                projectRequestDto.getProjectEmployeesRolesDtoSet().stream().map(projectEmployeesRolesMapper::toEntity).collect(Collectors.toSet()));

        return project;
    }

    public ProjectResponseDto toDto(Project project){
        ProjectResponseDto projectResponseDto = new ProjectResponseDto(
                project.getId(),
                project.getName(),
                project.getDescription(),
                project.getProjectStatusHistorySet().stream().map(projectStatusHistoryMapper::toDto).collect(Collectors.toSet()),
                project.getProjectEmployeesRolesSet().stream().map(projectEmployeesRolesMapper::toDto).collect(Collectors.toSet()));

        return projectResponseDto;
    }

}
