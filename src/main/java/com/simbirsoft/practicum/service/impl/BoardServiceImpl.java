package com.simbirsoft.practicum.service.impl;

import com.simbirsoft.practicum.dto.BoardDto;
import com.simbirsoft.practicum.entity.Board;
import com.simbirsoft.practicum.exception.BoardIdNotFoundException;
import com.simbirsoft.practicum.repository.BoardRepository;
import com.simbirsoft.practicum.service.BoardService;
import com.simbirsoft.practicum.service.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    BoardRepository boardRepository;
    BoardMapper boardMapper;

    @Autowired
    public BoardServiceImpl(BoardRepository boardRepository, BoardMapper boardMapper) {
        this.boardRepository = boardRepository;
        this.boardMapper = boardMapper;
    }

    @Override
    public BoardDto createBoardDto(BoardDto boardDto) {
        Board board = boardMapper.toEntity(boardDto);
        boardRepository.saveAndFlush(board);
        return boardMapper.toDto(board);
    }

    @Override
    public List<BoardDto> findAll() {

        return null;
    }

    @Override
    public void delete(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(() -> new BoardIdNotFoundException(id));
        boardRepository.delete(board);
    }
}
