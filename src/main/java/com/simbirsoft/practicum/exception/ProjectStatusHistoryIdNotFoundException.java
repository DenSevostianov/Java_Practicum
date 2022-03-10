package com.simbirsoft.practicum.exception;

public class ProjectStatusHistoryIdNotFoundException extends AppException{

    public ProjectStatusHistoryIdNotFoundException(Long id) {
        super("ProjectStatusHistory with id " + id + "not found");
    }
}
