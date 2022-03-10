package com.simbirsoft.practicum.service.mapper;

import com.simbirsoft.practicum.dto.ProjectEmployeesRolesDto;
import com.simbirsoft.practicum.entity.ProjectEmployeesRoles;
import org.springframework.stereotype.Component;

@Component
public class ProjectEmployeesRolesMapper {

    public ProjectEmployeesRolesDto toDto(ProjectEmployeesRoles projectEmployeesRoles){
        ProjectEmployeesRolesDto projectEmployeesRolesDto = new ProjectEmployeesRolesDto();
        projectEmployeesRolesDto.setId(projectEmployeesRoles.getId());
        return projectEmployeesRolesDto;
    }

    public ProjectEmployeesRoles toEntity(ProjectEmployeesRolesDto projectEmployeesRolesDto){
        ProjectEmployeesRoles projectEmployeesRoles = new ProjectEmployeesRoles();
        projectEmployeesRoles.setId(projectEmployeesRolesDto.getId());
        return projectEmployeesRoles;
    }


}
