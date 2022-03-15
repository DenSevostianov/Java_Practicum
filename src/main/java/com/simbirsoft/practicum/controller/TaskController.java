package com.simbirsoft.practicum.controller;

import com.simbirsoft.practicum.dto.TaskDto;
import com.simbirsoft.practicum.service.TaskService;
import com.simbirsoft.practicum.service.impl.TaskServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Task controller", description = "Task management / Контроллер задачи")
@RestController
@RequestMapping("/task")
public class TaskController {

    TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<TaskDto> createTask(@RequestBody TaskDto taskDto){
        return ResponseEntity.ok(taskService.createTask(taskDto));
    }

    @GetMapping
    public ResponseEntity<List<TaskDto>> findAll(){
        return ResponseEntity.ok(taskService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        taskService.delete(id);
        return ResponseEntity.ok("Ok");
    }
}
