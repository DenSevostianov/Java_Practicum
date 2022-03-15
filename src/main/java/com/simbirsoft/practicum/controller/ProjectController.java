package com.simbirsoft.practicum.controller;

import com.simbirsoft.practicum.dto.ProjectRequestDto;
import com.simbirsoft.practicum.dto.ProjectResponseDto;
import com.simbirsoft.practicum.service.ProjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Project controller", description = "Project management / Контроллер проекта")
@RestController
@RequestMapping("/Project")
public class ProjectController {


    ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public ResponseEntity<ProjectResponseDto> createProject(@RequestBody ProjectRequestDto projectRequestDto) {

        return ResponseEntity.ok(projectService.createProject(projectRequestDto));
    }

    @GetMapping
    public ResponseEntity<List<ProjectResponseDto>> findAll(){
        return ResponseEntity.ok(projectService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponseDto> findById(@PathVariable Long id){
        return ResponseEntity.ok(projectService.findById(id));
    }

    @PatchMapping
    public ResponseEntity<ProjectResponseDto> update(@RequestBody ProjectRequestDto projectRequestDto){
        return ResponseEntity.ok(projectService.update(projectRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        projectService.delete(id);
        return ResponseEntity.ok("Ok");
    }
}
