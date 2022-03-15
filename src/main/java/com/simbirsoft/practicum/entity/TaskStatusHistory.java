package com.simbirsoft.practicum.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "task_status_history")
public class TaskStatusHistory {


        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private long id;

        @ManyToOne
        @JoinColumn(name = "id_status")
        private Status status;

        @ManyToOne
        @JoinColumn(name = "id_task")
        private Task task;

        @Column(name = "date_start")
        private Timestamp data;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
