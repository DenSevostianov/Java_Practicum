package com.simbirsoft.practicum.controller;

import com.simbirsoft.practicum.dto.ProjectDto;
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
    public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectDto projectDto) {

        return ResponseEntity.ok(projectService.createProject(projectDto));
    }

    @GetMapping
    public ResponseEntity<List<ProjectDto>> findAll(){
        return ResponseEntity.ok(projectService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        projectService.delete(id);
        return ResponseEntity.ok("Ok");
    }
}
