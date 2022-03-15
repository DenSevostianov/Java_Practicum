package com.simbirsoft.practicum.service.mapper;

import com.simbirsoft.practicum.dto.RolesDto;
import com.simbirsoft.practicum.entity.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RolesMapper {


    public RolesDto toDto(Roles roles){
        RolesDto rolesDto = new RolesDto();
        rolesDto.setId(roles.getId());
        rolesDto.setRole(roles.getRole());
        //rolesDto.setProjectsDto(roles.getProjects().stream().map(projectMapper::getProjectDto).collect(Collectors.toSet()));
        return rolesDto;
    }

    public Roles toEntity(RolesDto rolesDto){
        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setRole(rolesDto.getRole());
        //roles.setProjects(rolesDto.getProjectsDto().stream().map(projectMapper::getProject).collect(Collectors.toSet()));
        return roles;
    }
}
