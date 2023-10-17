package com.example.board.crud.service;

import com.example.board.crud.domain.repository.BoardRepository;
import com.example.board.crud.dto.BoardDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceTest {

    @Autowired
    BoardService boardService;

    @Test
    public void update(){
        BoardDTO boardDTO = BoardDTO.builder().
                title("changed")
                .content("changed").build();
        System.out.println(boardService.modifyBoard(1L,boardDTO));

    }

}