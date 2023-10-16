package com.example.board.crud.service;

import com.example.board.crud.domain.BoardEntity;
import com.example.board.crud.dto.BoardDTO;
import org.springframework.stereotype.Service;

public interface BoardServiceImpl {
    public void createBoard(BoardDTO boardDTO);

    public default BoardEntity dtoToEntity(BoardDTO boardDTO){
        return BoardEntity.builder()
                .title(boardDTO.getTitle())
                .content(boardDTO.getContent()).build();
    }

}
