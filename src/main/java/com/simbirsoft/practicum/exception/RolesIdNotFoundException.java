package com.simbirsoft.practicum.exception;

public class RolesIdNotFoundException extends AppException {
    public RolesIdNotFoundException(Long id) {
        super("Roles with id " + id + " not found");
    }
}
