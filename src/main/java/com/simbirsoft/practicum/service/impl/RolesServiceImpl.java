package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.RolesDto;
import com.simbirsoft.practicum.entity.Roles;
import com.simbirsoft.practicum.exception.RolesIdNotFoundException;
import com.simbirsoft.practicum.repository.RolesRepository;
import com.simbirsoft.practicum.service.RolesService;
import com.simbirsoft.practicum.service.mapper.RolesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RolesServiceImpl implements RolesService {

    RolesRepository rolesRepository;
    RolesMapper rolesMapper;

    @Autowired
    public RolesServiceImpl(RolesRepository rolesRepository, RolesMapper rolesMapper) {
        this.rolesRepository = rolesRepository;
        this.rolesMapper = rolesMapper;
    }

    @Override
    public RolesDto create(RolesDto rolesDto) {
        Roles roles = rolesMapper.toEntity(rolesDto);
        rolesRepository.saveAndFlush(roles);
        return rolesMapper.toDto(roles);
    }

    @Override
    public List<RolesDto> findAll() {
        return rolesRepository.findAll().stream().map(rolesMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        Roles roles = rolesRepository.findById(id).orElseThrow(() -> new RolesIdNotFoundException(id));
        rolesRepository.delete(roles);
    }
}
