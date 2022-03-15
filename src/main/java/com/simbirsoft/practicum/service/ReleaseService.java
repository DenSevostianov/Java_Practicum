package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.ReleaseDto;

import java.util.List;
import java.util.Set;

public interface ReleaseService {

    ReleaseDto create(ReleaseDto releaseDto);
    List<ReleaseDto> findAll();
    void delete(Long id);
}
