package com.simbirsoft.practicum.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Task {
    @Id
    @Column(name = "id_task")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name_task")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_board")
    private Board board;

    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employees author;

    @ManyToOne
    @JoinColumn(name = "id_executor")
    private Employees executor;

    @OneToMany(mappedBy = "task")
    Set<Release> release = new HashSet<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Employees getAuthor() {
        return author;
    }

    public void setAuthor(Employees author) {
        this.author = author;
    }

    public Employees getExecutor() {
        return executor;
    }

    public void setExecutor(Employees executor) {
        this.executor = executor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
