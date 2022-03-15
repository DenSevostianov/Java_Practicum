package com.simbirsoft.practicum.dto;

import com.simbirsoft.practicum.entity.Board;
import com.simbirsoft.practicum.entity.Employees;

public class TaskDto {

    private String name;

    private Board board;

    private Employees author;

    private Employees executor;

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
}
