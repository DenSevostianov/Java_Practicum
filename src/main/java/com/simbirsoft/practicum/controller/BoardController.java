package com.simbirsoft.practicum.controller;

import com.simbirsoft.practicum.dto.BoardDto;
import com.simbirsoft.practicum.service.BoardService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Board Controller", description = "Board manager/ Управление доской задач")
@RestController
@RequestMapping("/board")
public class BoardController {

    BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping
    public ResponseEntity<BoardDto> createBoard(BoardDto boardDto){
        return ResponseEntity.ok(boardService.createBoardDto(boardDto));
    }

    @GetMapping
    public ResponseEntity<List<BoardDto>> findAll(){
        return ResponseEntity.ok(boardService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        boardService.delete(id);
        return ResponseEntity.ok("Ok");
    }
}
