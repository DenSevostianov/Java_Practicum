package com.simbirsoft.practicum.exception;

public class StatusTaskIdNotFoundException extends AppException {
    public StatusTaskIdNotFoundException(Long id) {
        super("StatusTask with id " + id + " not found");
    }
}
