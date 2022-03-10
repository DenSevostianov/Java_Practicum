package com.simbirsoft.practicum.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_release")
    private long id;

    @Column(name = "version")
    private int version;

    @Column(name = "date_start")
    private Timestamp data;

    @ManyToOne
    @JoinColumn(name = "id_task")
    private Task task;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
