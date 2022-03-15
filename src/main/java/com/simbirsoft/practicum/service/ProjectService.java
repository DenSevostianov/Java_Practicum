package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.ProjectRequestDto;
import com.simbirsoft.practicum.dto.ProjectResponseDto;


import java.util.List;

public interface ProjectService {

    ProjectResponseDto createProject(ProjectRequestDto projectRequestDto);
    List<ProjectResponseDto> findAll();
    ProjectResponseDto findById(Long id);
    ProjectResponseDto update(ProjectRequestDto projectRequestDto);
    void delete (Long id);


}
