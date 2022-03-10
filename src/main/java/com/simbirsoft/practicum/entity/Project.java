package com.simbirsoft.practicum.entity;

import javax.persistence.*;
import java.util.HashSet;
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
    Set<ProjectStatusHistory> psh = new HashSet<>();

    @OneToMany(mappedBy = "project")
    Set<ProjectEmployeesRoles> projectEmployeesRolesSet = new HashSet<>();


    /*@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "project_employees_roles",
            joinColumns = {@JoinColumn(name = "id_project", referencedColumnName = "id_project")},
            inverseJoinColumns = {@JoinColumn(name = "id_roles", referencedColumnName = "id")}
    )
    Set<Roles> rolesSet = new HashSet<>();*/



    public Project() {
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

    /*public Set<Roles> getRolesSet() {
        return rolesSet;
    }

    public void setRolesSet(Set<Roles> rolesSet) {
        this.rolesSet = rolesSet;
    }*/


}
