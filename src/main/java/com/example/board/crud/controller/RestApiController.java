package com.example.board.crud.controller;


import com.example.board.crud.dto.Request.BoardRequest;
import com.example.board.crud.dto.Response.BoardResponse;
import com.example.board.crud.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class RestApiController { // 이름 변경

    private final BoardService boardService;

    @PostMapping("/post")
    public void createBoard(@RequestBody BoardRequest boardRequest){
        boardService.createBoard(boardRequest);
    }

    @GetMapping("/get")
    public BoardResponse readBoard(
            @RequestParam(required = false, value = "id") Long id
    ){
        return boardService.readBoard(id);
    }

    @PatchMapping("/patch/{id}")
    public BoardResponse modifyBoard(
            @PathVariable("id") Long id,
            @RequestBody BoardRequest boardRequest
    ){
         return boardService.modifyBoard(id,boardRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBoard(@PathVariable Long id){
        boardService.deleteBoard(id);
    }

}
