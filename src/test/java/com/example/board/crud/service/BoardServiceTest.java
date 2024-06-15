package com.example.board.crud.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardServiceTest {

    @Autowired
    BoardServiceImpl boardService;

    @Test
    public void update(){
        BoardDTO boardDTO = BoardDTO.builder().
                title("changed")
                .content("changed").build();
        System.out.println(boardService.modifyBoard(1L,boardDTO));

    }

}