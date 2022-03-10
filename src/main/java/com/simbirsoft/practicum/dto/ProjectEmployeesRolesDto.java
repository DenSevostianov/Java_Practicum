package com.simbirsoft.practicum.dto;



public class ProjectEmployeesRolesDto {
    private long id;
    private ProjectDto projectDto;
    private EmployeesDto employeesDto;
    private RolesDto rolesDto;

    public ProjectEmployeesRolesDto() {
    }

    public ProjectDto getProjectDto() {
        return projectDto;
    }

    public void setProjectDto(ProjectDto projectDto) {
        this.projectDto = projectDto;
    }

    public EmployeesDto getEmployeesDto() {
        return employeesDto;
    }

    public void setEmployeesDto(EmployeesDto employeesDto) {
        this.employeesDto = employeesDto;
    }

    public RolesDto getRolesDto() {
        return rolesDto;
    }

    public void setRolesDto(RolesDto rolesDto) {
        this.rolesDto = rolesDto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
