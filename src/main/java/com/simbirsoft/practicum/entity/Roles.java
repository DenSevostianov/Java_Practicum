package com.simbirsoft.practicum.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;

    @Column(name = "role")
    private String role;

    //@ManyToMany(mappedBy = "rolesSet")
    //Set<Project> projects = new HashSet<>();

    @OneToMany(mappedBy = "roles")
    Set<ProjectEmployeesRoles> projectEmployeesRolesSet = new HashSet<>();

    public Roles() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
