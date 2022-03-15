package com.simbirsoft.practicum.exception;

public class BoardIdNotFoundException extends AppException {

    public BoardIdNotFoundException(Long id) {
        super("Board with id " + id + " Нет") ;
    }
}
