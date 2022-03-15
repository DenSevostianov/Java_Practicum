package com.simbirsoft.practicum.dto;


import java.util.Set;

public class ProjectResponseDto {

    private Long id;
    private String name;
    private String description;
    Set<ProjectStatusHistoryDto> projectStatusHistoryDtoSet;
    Set<ProjectEmployeesRolesDto> projectEmployeesRolesSetDtoSet;

    public ProjectResponseDto(Long id, String name, String description,
                              Set<ProjectStatusHistoryDto> projectStatusHistoryDtoSet,
                              Set<ProjectEmployeesRolesDto> projectEmployeesRolesDtoSet) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.projectStatusHistoryDtoSet = projectStatusHistoryDtoSet;
        this.projectEmployeesRolesSetDtoSet = projectEmployeesRolesDtoSet;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<ProjectStatusHistoryDto> getProjectStatusHistoryDtoSet() {
        return projectStatusHistoryDtoSet;
    }

    public Set<ProjectEmployeesRolesDto> getProjectEmployeesRolesDtoSet() {
        return projectEmployeesRolesSetDtoSet;
    }
}
