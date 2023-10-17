package com.example.board.crud.controller;


import com.example.board.crud.domain.BoardEntity;
import com.example.board.crud.dto.BoardDTO;
import com.example.board.crud.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
@Slf4j
public class RestController {
    @Autowired
    private BoardService boardService;

    @PostMapping("/post")
    public BoardDTO postMethod(@RequestBody BoardDTO boardDTO){
        boardService.createBoard(boardDTO);
        return boardDTO;
    }

    @GetMapping("/get")
    public BoardDTO getMethod(
            @RequestParam(required = false, value = "id") Long id
    ){
        log.info("mappingPath userId={}", id);
        return boardService.readBoard(id);
    }

    @PatchMapping("/patch/{id}")
    public BoardDTO patchMethod(
            @PathVariable("id") Long id,
            @RequestBody BoardDTO boardDTO
    ){
         return boardService.modifyBoard(id,boardDTO);
    }







}
