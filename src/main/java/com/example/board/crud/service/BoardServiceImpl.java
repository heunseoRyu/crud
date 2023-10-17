package com.example.board.crud.service;

import com.example.board.crud.domain.BoardEntity;
import com.example.board.crud.dto.BoardDTO;

public interface BoardServiceImpl {
    public void createBoard(BoardDTO boardDTO);
    public BoardDTO readBoard(Long id);

    public BoardDTO modifyBoard(Long id,BoardDTO boardDTO);

    public BoardDTO deleteBoard(Long id);
    public default BoardEntity dtoToEntity(BoardDTO boardDTO){
        return BoardEntity.builder()
                .title(boardDTO.getTitle())
                .content(boardDTO.getContent()).build();
    }

    public default BoardDTO entityToDto(BoardEntity boardEntity){
        return BoardDTO.builder()
                .id(boardEntity.getId())
                .title(boardEntity.getTitle())
                .content(boardEntity.getContent())
                .createdDate(boardEntity.getCreatedDate())
                .modifiedDate(boardEntity.getModifiedDate()).build();
    }

}
