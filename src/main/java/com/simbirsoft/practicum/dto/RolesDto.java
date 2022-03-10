package com.simbirsoft.practicum.dto;

import com.simbirsoft.practicum.entity.Project;

import java.util.HashSet;
import java.util.Set;

public class RolesDto {

    private long id;

    private String role;

    //private Set<ProjectDto> projectsDto = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /*public Set<ProjectDto> getProjectsDto() {
        return projectsDto;
    }

    public void setProjectsDto(Set<ProjectDto> projectsDto) {
        this.projectsDto = projectsDto;
    }*/
}
