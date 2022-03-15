package com.simbirsoft.practicum.exception;

public class EmployeesIdNotFoundException extends AppException {

    public EmployeesIdNotFoundException(Long id) {
        super("Employee wish id " + id + " non found");
    }
}
