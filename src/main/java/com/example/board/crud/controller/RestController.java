package com.example.board.crud.controller;


import com.example.board.crud.dto.BoardDTO;
import com.example.board.crud.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @Autowired
    private BoardService boardService;

    @PostMapping("/post")
    public BoardDTO postMethod(@RequestBody BoardDTO boardDTO){
        boardService.createBoard(boardDTO);
        return boardDTO;
    }
}
