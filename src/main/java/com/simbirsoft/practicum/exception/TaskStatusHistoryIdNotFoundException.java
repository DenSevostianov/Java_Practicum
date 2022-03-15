package com.simbirsoft.practicum.exception;

public class TaskStatusHistoryIdNotFoundException extends AppException{
    public TaskStatusHistoryIdNotFoundException(Long id) {
        super("TaskStatusHistory with id " + id + " not found.");
    }
}
