package com.simbirsoft.practicum.service.mapper;
import com.simbirsoft.practicum.dto.ProjectDto;
import com.simbirsoft.practicum.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class ProjectMapper {

    RolesMapper rolesMapper;

    @Autowired
    public ProjectMapper(RolesMapper rolesMapper) {
        this.rolesMapper = rolesMapper;
    }

    public Project toEntity(ProjectDto projectDto){
        Project project = new Project();
        project.setName(projectDto.getName());
        project.setDescription(projectDto.getDescription());
        //project.setRolesSet(projectDto.getRolesDtoSet().stream().map(rolesMapper::toEntity).collect(Collectors.toSet()));
        return project;
    }

    public ProjectDto toDto(Project project){
        ProjectDto projectDto = new ProjectDto();
        projectDto.setName(project.getName());
        projectDto.setDescription(project.getDescription());
        //projectDto.setRolesDtoSet(project.getRolesSet().stream().map(rolesMapper::toDto).collect(Collectors.toSet()));
        return projectDto;
    }

}
