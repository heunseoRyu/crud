package com.example.board.crud.service;

import com.example.board.crud.domain.repository.BoardRepository;
import com.example.board.crud.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements BoardServiceImpl {
    @Autowired
    BoardRepository boardRepository;
    @Override
    public void createBoard(BoardDTO boardDTO){
        boardRepository.save(dtoToEntity(boardDTO));
    }

}
