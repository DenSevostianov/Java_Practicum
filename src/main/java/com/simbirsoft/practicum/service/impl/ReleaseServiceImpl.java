package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.ReleaseDto;
import com.simbirsoft.practicum.entity.Release;
import com.simbirsoft.practicum.exception.ReleaseIdNotFoundException;
import com.simbirsoft.practicum.repository.ReleaseRepository;
import com.simbirsoft.practicum.service.ReleaseService;
import com.simbirsoft.practicum.service.mapper.ReleaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ReleaseServiceImpl implements ReleaseService {

    ReleaseRepository releaseRepository;
    ReleaseMapper releaseMapper;

    @Autowired
    public ReleaseServiceImpl(ReleaseRepository releaseRepository, ReleaseMapper releaseMapper) {
        this.releaseRepository = releaseRepository;
        this.releaseMapper = releaseMapper;
    }

    @Override
    public ReleaseDto create(ReleaseDto releaseDto) {
        Release release = releaseMapper.toEntity(releaseDto);
        releaseRepository.saveAndFlush(release);
        return releaseMapper.toDto(release);
    }

    @Override
    public List<ReleaseDto> findAll() {
        return releaseRepository.findAll().stream().map(releaseMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        Release release = releaseRepository.findById(id).orElseThrow(() -> new ReleaseIdNotFoundException(id));
        releaseRepository.delete(release);

    }
}
