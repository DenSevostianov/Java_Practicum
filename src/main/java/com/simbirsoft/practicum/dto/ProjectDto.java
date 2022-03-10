package com.simbirsoft.practicum.dto;

import com.simbirsoft.practicum.entity.Roles;

import java.util.Set;

public class ProjectDto {

    private String name;
    private String description;
    private Set<RolesDto> rolesDtoSet;

    public ProjectDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ProjectDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<RolesDto> getRolesDtoSet() {
        return rolesDtoSet;
    }

    public void setRolesDtoSet(Set<RolesDto> rolesDtoSet) {
        this.rolesDtoSet = rolesDtoSet;
    }
}
