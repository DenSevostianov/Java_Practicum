package com.simbirsoft.practicum.service.mapper;

import com.simbirsoft.practicum.dto.ProjectStatusHistoryDto;
import com.simbirsoft.practicum.entity.ProjectStatusHistory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ProjectStatusHistoryMapper {

    public ProjectStatusHistoryDto toDto(ProjectStatusHistory projectStatusHistory){
        ProjectStatusHistoryDto projectStatusHistoryDto = new ProjectStatusHistoryDto();
        projectStatusHistoryDto.setData(projectStatusHistory.getData());
        projectStatusHistoryDto.setProject(projectStatusHistory.getProject());
        projectStatusHistoryDto.setStatus(projectStatusHistory.getStatus());
        return projectStatusHistoryDto;

    }

    public ProjectStatusHistory toEntity(ProjectStatusHistoryDto projectStatusHistoryDto){
        ProjectStatusHistory projectStatusHistory = new ProjectStatusHistory();
        projectStatusHistory.setData(projectStatusHistoryDto.getData());
        projectStatusHistory.setProject(projectStatusHistoryDto.getProject());
        projectStatusHistory.setStatus(projectStatusHistoryDto.getStatus());
        return projectStatusHistory;
    }
}
