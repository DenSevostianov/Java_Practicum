package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.EmployeesDto;
import com.simbirsoft.practicum.entity.Employees;
import com.simbirsoft.practicum.exception.EmployeesIdNotFoundException;
import com.simbirsoft.practicum.repository.EmployeesRepository;
import com.simbirsoft.practicum.service.EmployeesService;
import com.simbirsoft.practicum.service.mapper.EmployeesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeesServiceImpl implements EmployeesService {

    EmployeesRepository employeesRepository;
    EmployeesMapper employeesMapper;

    @Autowired
    public EmployeesServiceImpl(EmployeesRepository employeesRepository, EmployeesMapper employeesMapper) {
        this.employeesRepository = employeesRepository;
        this.employeesMapper = employeesMapper;
    }

    public EmployeesServiceImpl() {
    }

    @Override
    public EmployeesDto createEmployees(EmployeesDto employeesDto) {
        Employees employees = employeesMapper.toEntity(employeesDto);
        employeesRepository.saveAndFlush(employees);
        return employeesMapper.toDto(employees);
    }

    @Override
    public List<EmployeesDto> findAll() {
        return employeesRepository.findAll().
                stream().map(employeesMapper::toDto).
                collect(Collectors.toList());
    }

    @Override
    public void deleteEmployees(Long id) {
        Employees employees = employeesRepository.findById(id).orElseThrow(() -> new EmployeesIdNotFoundException(id));
        employeesRepository.delete(employees);

    }
}
