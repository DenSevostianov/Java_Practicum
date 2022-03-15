package com.simbirsoft.practicum.exception;

import com.simbirsoft.practicum.entity.ProjectEmployeesRoles;

public class ProjectEmployeesRolesIdNotFoundException extends AppException {
    public ProjectEmployeesRolesIdNotFoundException(Long id) {
        super("ProjectEmployeesRoles with id " + id + "not found.");
    }
}
