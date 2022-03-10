package com.simbirsoft.practicum.service;

import com.simbirsoft.practicum.dto.BoardDto;

import java.util.List;

public interface BoardService {
    BoardDto createBoardDto(BoardDto boardDto);
    List<BoardDto> findAll();
    void delete(Long id);
}
