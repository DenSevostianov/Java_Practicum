package com.simbirsoft.practicum.dto;

import com.simbirsoft.practicum.entity.Task;

import java.sql.Timestamp;

public class ReleaseDto {

    private int version;
    private Task task;
    private Timestamp data;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
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
