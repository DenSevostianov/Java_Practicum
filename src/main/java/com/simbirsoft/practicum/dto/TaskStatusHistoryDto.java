package com.simbirsoft.practicum.dto;

import com.simbirsoft.practicum.entity.Project;
import com.simbirsoft.practicum.entity.Status;
import com.simbirsoft.practicum.entity.Task;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;


public class TaskStatusHistoryDto {

    private Status status;
    private Task task;
    private Timestamp data;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }
}
