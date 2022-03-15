package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.EmployeesDto;
import com.simbirsoft.practicum.entity.Employees;

import java.util.List;

public interface EmployeesService {
    EmployeesDto createEmployees(EmployeesDto employeesDto);
    List<EmployeesDto> findAll();
    void deleteEmployees(Long id);
}
