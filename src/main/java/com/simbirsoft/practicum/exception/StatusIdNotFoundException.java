package com.simbirsoft.practicum.exception;

public class StatusIdNotFoundException extends AppException{
    public StatusIdNotFoundException(Long id){
        super("Status with id " + id + " not found");
    }
}
