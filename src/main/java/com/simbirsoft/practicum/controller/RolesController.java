package com.simbirsoft.practicum.controller;

import com.simbirsoft.practicum.dto.RolesDto;
import com.simbirsoft.practicum.service.RolesService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Roles controller", description = "Roles management / Контроллер прав пользователей")
@RestController
@RequestMapping("/roles")
public class RolesController {

    RolesService rolesService;

    @Autowired
    public RolesController(RolesService rolesService) {
        this.rolesService = rolesService;
    }

    @PostMapping
    public ResponseEntity<RolesDto> create(@RequestBody RolesDto rolesDto){
        return ResponseEntity.ok(rolesService.create(rolesDto));
    }

    @GetMapping
    public ResponseEntity<List<RolesDto>> findAll(){
        return ResponseEntity.ok(rolesService.findAll());
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestParam Long id){
        rolesService.delete(id);
        return ResponseEntity.ok("Ok");
    }
}
