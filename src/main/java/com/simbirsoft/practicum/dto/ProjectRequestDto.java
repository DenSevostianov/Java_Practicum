package com.simbirsoft.practicum.dto;

import com.simbirsoft.practicum.entity.ProjectStatusHistory;
import com.simbirsoft.practicum.entity.Roles;

import java.util.Set;

public class ProjectRequestDto {

    private Long id;
    private String name;
    private String description;
    private Set<ProjectStatusHistoryDto> projectStatusHistoriesDtoSet;
    private Set<ProjectEmployeesRolesDto> projectEmployeesRolesDtoSet;

    public ProjectRequestDto(Long id,
                             String name,
                             String description,
                             Set<ProjectStatusHistoryDto> projectStatusHistoriesDtoSet,
                             Set<ProjectEmployeesRolesDto> projectEmployeesRolesDtoSet) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.projectStatusHistoriesDtoSet = projectStatusHistoriesDtoSet;
        this.projectEmployeesRolesDtoSet = projectEmployeesRolesDtoSet;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<ProjectStatusHistoryDto> getProjectStatusHistoriesDtoSet() {
        return projectStatusHistoriesDtoSet;
    }

    public Set<ProjectEmployeesRolesDto> getProjectEmployeesRolesDtoSet() {
        return projectEmployeesRolesDtoSet;
    }
}
