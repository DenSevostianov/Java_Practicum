package com.simbirsoft.practicum.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Board")
public class Board {

    @Id
    //@Column(name = "id_board")
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    //@Column(name = "id_project")
    //private Long idProject;

    @Column(name = "name_board")
    private String name;

    @OneToOne
    @MapsId
    private Project project;

    @OneToMany(mappedBy = "board")
    Set<Task> tasks = new HashSet();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
