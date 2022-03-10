package com.simbirsoft.practicum.controller;



import com.simbirsoft.practicum.dto.TaskStatusHistoryDto;
import com.simbirsoft.practicum.service.TaskStatusHistoryService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "History task controller", description = "Status task management / Контроллер статуса задач.")
@RestController
@RequestMapping("/tshc")
public class TaskStatusHistoryController {

    TaskStatusHistoryService taskStatusHistoryService;

    @Autowired
    public TaskStatusHistoryController(TaskStatusHistoryService taskStatusHistoryService) {
        this.taskStatusHistoryService = taskStatusHistoryService;
    }

    @PostMapping
    public ResponseEntity<TaskStatusHistoryDto> create(@RequestBody TaskStatusHistoryDto taskStatusHistoryDto){
        return ResponseEntity.ok(taskStatusHistoryService.create(taskStatusHistoryDto));
    }

    @GetMapping
    public ResponseEntity<List<TaskStatusHistoryDto>> findAll(){
        return ResponseEntity.ok(taskStatusHistoryService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        taskStatusHistoryService.delete(id);
        return ResponseEntity.ok("Ok");
    }

}
