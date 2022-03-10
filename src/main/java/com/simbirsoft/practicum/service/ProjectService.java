package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.ProjectDto;


import java.util.List;

public interface ProjectService {

    ProjectDto createProject(ProjectDto projectDto);
    List<ProjectDto> findAll();
    void delete (Long id);


}
