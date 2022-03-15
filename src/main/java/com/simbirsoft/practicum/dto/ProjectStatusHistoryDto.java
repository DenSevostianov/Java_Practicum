package com.simbirsoft.practicum.dto;

import com.simbirsoft.practicum.entity.Project;
import com.simbirsoft.practicum.entity.Status;

import java.sql.Timestamp;

public class ProjectStatusHistoryDto {

    private Status status;
    private Project project;
    private Timestamp data;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }
}
