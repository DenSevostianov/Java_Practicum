package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.RolesDto;

import java.util.List;

public interface RolesService {

    RolesDto create(RolesDto rolesDto);
    List<RolesDto> findAll();
    void delete(Long id);
}
