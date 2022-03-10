package com.simbirsoft.practicum.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "status_task")
public class StatusTask {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name_status")
    private String nameStatus;

    @OneToMany(mappedBy = "status")
    Set<TaskStatusHistory> tsh = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameStatus() {
        return nameStatus;
    }

    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
    }

    public Set<TaskStatusHistory> getTsh() {
        return tsh;
    }

    public void setTsh(Set<TaskStatusHistory> tsh) {
        this.tsh = tsh;
    }
}
