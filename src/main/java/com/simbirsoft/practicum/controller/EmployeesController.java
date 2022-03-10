package com.simbirsoft.practicum.controller;

import com.simbirsoft.practicum.dto.EmployeesDto;
import com.simbirsoft.practicum.service.EmployeesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Employees controller", description = "Employees management / Управление сотрудниками")
@RestController
@RequestMapping("/employees")
public class EmployeesController {

    EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @PostMapping
    public ResponseEntity<EmployeesDto> createEmployees(@RequestBody EmployeesDto employeesDto){
        return ResponseEntity.ok(employeesService.createEmployees(employeesDto));
    }

    @GetMapping
    public ResponseEntity<List<EmployeesDto>> findAll(){
        return ResponseEntity.ok(employeesService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        employeesService.deleteEmployees(id);
        return ResponseEntity.ok("Ok");
    }
}
