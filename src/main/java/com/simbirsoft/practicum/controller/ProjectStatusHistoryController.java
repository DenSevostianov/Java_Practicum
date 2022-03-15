package com.simbirsoft.practicum.controller;

import com.simbirsoft.practicum.dto.ProjectStatusHistoryDto;
import com.simbirsoft.practicum.entity.ProjectStatusHistory;
import com.simbirsoft.practicum.service.ProjectStatusHistoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Project Status History controller", description = "Project Status History management / Контроллер статуса и истории проекта")
@RestController
@RequestMapping("/project_status_history")
public class ProjectStatusHistoryController {

    ProjectStatusHistoryService projectStatusHistoryService;

    @Autowired
    public ProjectStatusHistoryController(ProjectStatusHistoryService projectStatusHistoryService) {
        this.projectStatusHistoryService = projectStatusHistoryService;
    }

    @PostMapping
    public ResponseEntity<ProjectStatusHistoryDto> createProjectStatusHistory(@RequestBody ProjectStatusHistoryDto projectStatusHistoryDto){
        return ResponseEntity.ok(projectStatusHistoryService.createProjectStatusHistory(projectStatusHistoryDto));
    }

    @GetMapping
    public ResponseEntity<List<ProjectStatusHistoryDto>> findAll(){
        return ResponseEntity.ok(projectStatusHistoryService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        projectStatusHistoryService.delete(id);
        return ResponseEntity.ok("Ok");
    }
}
