package com.simbirsoft.practicum.service.mapper;

import com.simbirsoft.practicum.dto.EmployeesDto;
import com.simbirsoft.practicum.entity.Employees;
import org.springframework.stereotype.Component;

@Component
public class EmployeesMapper {

    public EmployeesDto toDto(Employees employees){
        EmployeesDto employeesDto = new EmployeesDto();
        employeesDto.setUsername(employees.getUsername());
        employeesDto.setPassword(employees.getPassword());
        return employeesDto;
    }

    public Employees toEntity(EmployeesDto employeesDto){
        Employees employees =new Employees();
        employees.setUsername(employeesDto.getUsername());
        employees.setPassword(employeesDto.getPassword());
        return employees;
    }
}
