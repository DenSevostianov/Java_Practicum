package com.simbirsoft.practicum.controller;

import com.simbirsoft.practicum.dto.StatusTaskDto;
import com.simbirsoft.practicum.service.StatusTaskService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "StatusTask controller", description = "Status Task management / Контроллер статуса задачи")
@RestController
@RequestMapping("/status_task")
public class StatusTaskController {

    StatusTaskService statusTaskService;

    @Autowired
    public StatusTaskController(StatusTaskService statusTaskService) {
        this.statusTaskService = statusTaskService;
    }

    @PostMapping
    public ResponseEntity<StatusTaskDto> create(@RequestBody StatusTaskDto statusTaskDto){
        return ResponseEntity.ok(statusTaskService.create(statusTaskDto));
    }

    @GetMapping
    public ResponseEntity<List<StatusTaskDto>> findAll(){
        return ResponseEntity.ok(statusTaskService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        statusTaskService.delete(id);
        return ResponseEntity.ok("ok");
    }
}
