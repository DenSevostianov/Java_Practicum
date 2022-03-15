package com.simbirsoft.practicum.dto;

public class EmployeesDto {

    private String username;
    private String password;

    public EmployeesDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public EmployeesDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
