package com.simbirsoft.practicum.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employees {

    @Id
    @Column(name = "id_employee")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "author")
    Set<Task> authors = new HashSet<>();

    @OneToMany(mappedBy = "executor")
    Set<Task> executors = new HashSet<>();

    @OneToMany(mappedBy = "employees")
    Set<ProjectEmployeesRoles> projectEmployeesRolesSet = new HashSet<>();

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /*public Set<Task> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Task> authors) {
        this.authors = authors;
    }*/
}
