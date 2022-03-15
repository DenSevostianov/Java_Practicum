package com.simbirsoft.practicum.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Project")
public class Project {

    @Id
    @Column(name = "id_project")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name_project")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "project")
    Set<ProjectStatusHistory> projectStatusHistorySet;

    @OneToMany(mappedBy = "project")
    Set<ProjectEmployeesRoles> projectEmployeesRolesSet;

    public Project() {
    }

    public Project(Long id,
                   String name,
                   String description,
                   Set<ProjectStatusHistory> projectStatusHistorySet,
                   Set<ProjectEmployeesRoles> projectEmployeesRolesSet) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.projectStatusHistorySet = projectStatusHistorySet;
        this.projectEmployeesRolesSet = projectEmployeesRolesSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<ProjectStatusHistory> getProjectStatusHistorySet() {
        return projectStatusHistorySet;
    }

    public void setProjectStatusHistorySet(Set<ProjectStatusHistory> projectStatusHistorySet) {
        this.projectStatusHistorySet = projectStatusHistorySet;
    }

    public Set<ProjectEmployeesRoles> getProjectEmployeesRolesSet() {
        return projectEmployeesRolesSet;
    }

    public void setProjectEmployeesRolesSet(Set<ProjectEmployeesRoles> projectEmployeesRolesSet) {
        this.projectEmployeesRolesSet = projectEmployeesRolesSet;
    }
}
