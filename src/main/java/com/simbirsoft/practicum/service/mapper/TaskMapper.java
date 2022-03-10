package com.simbirsoft.practicum.service.mapper;

import com.simbirsoft.practicum.dto.TaskDto;
import com.simbirsoft.practicum.entity.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public TaskDto toDto(Task task){
        TaskDto taskDto = new TaskDto();
        taskDto.setName(task.getName());
        taskDto.setBoard(task.getBoard());
        taskDto.setAuthor(task.getAuthor());
        taskDto.setExecutor(task.getExecutor());
        return taskDto;
    }

    public Task toEntity(TaskDto taskDto){
        Task task = new Task();
        task.setName(taskDto.getName());
        task.setBoard(taskDto.getBoard());
        task.setAuthor(taskDto.getAuthor());
        task.setExecutor(taskDto.getExecutor());
        return task;
    }
}
