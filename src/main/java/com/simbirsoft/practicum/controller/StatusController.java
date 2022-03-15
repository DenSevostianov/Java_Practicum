package com.simbirsoft.practicum.controller;

import com.simbirsoft.practicum.dto.StatusDto;
import com.simbirsoft.practicum.service.StatusService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Status controller", description = "Status management / Статус проекта проекта")
@RestController
@RequestMapping("/status")
public class StatusController {

    StatusService statusService;

    @Autowired
    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @PostMapping
    public ResponseEntity<StatusDto> create(@RequestBody StatusDto statusDto){
        return ResponseEntity.ok(statusService.createStatus(statusDto));
    }

    @GetMapping
    public ResponseEntity<List<StatusDto>> findAll(){
        return ResponseEntity.ok(statusService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        statusService.delete(id);
        return ResponseEntity.ok("ok");
    }

}
