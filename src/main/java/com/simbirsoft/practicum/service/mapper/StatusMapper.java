package com.simbirsoft.practicum.service.mapper;

import com.simbirsoft.practicum.dto.StatusDto;
import com.simbirsoft.practicum.entity.Status;
import org.springframework.stereotype.Component;

@Component
public class StatusMapper {

    public StatusDto toDto(Status status){
        StatusDto statusDto = new StatusDto();
        statusDto.setNameStatus(status.getNameStatus());
        return statusDto;
    }

    public Status toEntity(StatusDto statusDto){
        Status status = new Status();
        status.setNameStatus(statusDto.getNameStatus());
        return status;
    }
}
