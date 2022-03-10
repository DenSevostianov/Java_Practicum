package com.simbirsoft.practicum.service.mapper;

import com.simbirsoft.practicum.dto.StatusDto;
import com.simbirsoft.practicum.dto.StatusTaskDto;
import com.simbirsoft.practicum.entity.Status;
import com.simbirsoft.practicum.entity.StatusTask;
import org.springframework.stereotype.Component;

@Component
public class StatusTaskMapper {

    public StatusTaskDto toDto(StatusTask statusTask){
        StatusTaskDto statusTaskDto = new StatusTaskDto();
        statusTaskDto.setNameStatus(statusTask.getNameStatus());
        return statusTaskDto;
    }

    public StatusTask toEntity(StatusTaskDto statusTaskDto){
        StatusTask statusTask = new StatusTask();
        statusTask.setNameStatus(statusTaskDto.getNameStatus());
        return statusTask;
    }
}
