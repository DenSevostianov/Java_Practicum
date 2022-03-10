package com.simbirsoft.practicum.service.mapper;

import com.simbirsoft.practicum.dto.TaskStatusHistoryDto;
import com.simbirsoft.practicum.entity.TaskStatusHistory;
import org.springframework.stereotype.Component;

@Component
public class TaskStatusHistoryMapper {

    public TaskStatusHistoryDto toDto(TaskStatusHistory taskStatusHistory){
        TaskStatusHistoryDto taskStatusHistoryDto = new TaskStatusHistoryDto();
        taskStatusHistoryDto.setData(taskStatusHistory.getData());
        taskStatusHistoryDto.setTask(taskStatusHistory.getTask());
        taskStatusHistoryDto.setStatus(taskStatusHistory.getStatus());
        return taskStatusHistoryDto;

    }

    public TaskStatusHistory toEntity(TaskStatusHistoryDto taskStatusHistoryDto){
        TaskStatusHistory taskStatusHistory = new TaskStatusHistory();
        taskStatusHistory.setData(taskStatusHistoryDto.getData());
        taskStatusHistory.setTask(taskStatusHistoryDto.getTask());
        taskStatusHistory.setStatus(taskStatusHistoryDto.getStatus());
        return taskStatusHistory;
    }
}
