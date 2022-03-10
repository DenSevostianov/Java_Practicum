package com.simbirsoft.practicum.entity;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "project_status_history")
public class ProjectStatusHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "id_project")
    private Project project;

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
