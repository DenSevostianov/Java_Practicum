package com.simbirsoft.practicum.controller;

import com.simbirsoft.practicum.dto.ReleaseDto;
import com.simbirsoft.practicum.service.ReleaseService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Release controller", description = "Release management / Контроллер релиза задачи")
@RestController
@RequestMapping("/release")
public class ReleaseController {

    ReleaseService releaseService;

    @Autowired
    public ReleaseController(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    @PostMapping
    public ResponseEntity<ReleaseDto> create(@RequestBody ReleaseDto releaseDto){
        return ResponseEntity.ok(releaseService.create(releaseDto));
    }

    @GetMapping
    public ResponseEntity<List<ReleaseDto>> findAll(){
        return ResponseEntity.ok(releaseService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        releaseService.delete(id);
        return ResponseEntity.ok("Ok");
    }
}
