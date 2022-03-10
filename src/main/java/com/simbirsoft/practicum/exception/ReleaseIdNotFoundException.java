package com.simbirsoft.practicum.exception;

public class ReleaseIdNotFoundException extends AppException {
    public ReleaseIdNotFoundException(Long id) {
        super("Release with id " + id + " not found");
    }
}
