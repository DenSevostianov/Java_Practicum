package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.ProjectEmployeesRolesDto;


import java.util.List;

public interface ProjectEmployeesRolesService {
    ProjectEmployeesRolesDto create(ProjectEmployeesRolesDto projectEmployeesRolesDto);
    List<ProjectEmployeesRolesDto> findAll();
    void delete(Long id);
}
