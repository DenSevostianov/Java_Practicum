package com.simbirsoft.practicum.service.mapper;

import com.simbirsoft.practicum.dto.ReleaseDto;
import com.simbirsoft.practicum.entity.Release;
import org.springframework.stereotype.Component;

@Component
public class ReleaseMapper {

    public ReleaseDto toDto(Release release){
        ReleaseDto releaseDto = new ReleaseDto();
        releaseDto.setVersion(release.getVersion());
        releaseDto.setData(release.getData());
        releaseDto.setTask(release.getTask());
        return releaseDto;

    }

    public Release toEntity(ReleaseDto releaseDto){
        Release release = new Release();
        release.setVersion(releaseDto.getVersion());
        release.setData(releaseDto.getData());
        release.setTask(releaseDto.getTask());
        return release;
    }
}
