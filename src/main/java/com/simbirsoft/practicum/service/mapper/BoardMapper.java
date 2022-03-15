package com.simbirsoft.practicum.service.mapper;

import com.simbirsoft.practicum.dto.BoardDto;
import com.simbirsoft.practicum.entity.Board;
import org.springframework.stereotype.Component;

@Component
public class BoardMapper {
    public BoardDto toDto(Board board){
        BoardDto boardDto = new BoardDto();
        boardDto.setName(board.getName());
        boardDto.setId(board.getId());
        return boardDto;
    }

    public Board toEntity(BoardDto boardDto){
        Board board = new Board();
        board.setName(boardDto.getName());
        board.setId(boardDto.getId());

        return board;
    }
}
