package com.simbirsoft.practicum.controller;


import com.simbirsoft.practicum.dto.ProjectEmployeesRolesDto;
import com.simbirsoft.practicum.dto.ProjectStatusHistoryDto;
import com.simbirsoft.practicum.service.ProjectEmployeesRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perc")
public class ProjectEmployeesRolesController {

    ProjectEmployeesRolesService projectEmployeesRolesService;

    @Autowired
    public ProjectEmployeesRolesController(ProjectEmployeesRolesService projectEmployeesRolesService) {
        this.projectEmployeesRolesService = projectEmployeesRolesService;
    }
    @PostMapping
    public ResponseEntity<ProjectEmployeesRolesDto> create(@RequestBody ProjectEmployeesRolesDto projectEmployeesRolesDto){
        return ResponseEntity.ok(projectEmployeesRolesService.create(projectEmployeesRolesDto));
    }

    @GetMapping
    public ResponseEntity<List<ProjectEmployeesRolesDto>> findAll(){
        return ResponseEntity.ok(projectEmployeesRolesService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        projectEmployeesRolesService.delete(id);
        return ResponseEntity.ok("Ok");
    }

}
