package com.example.board.crud.service;

import com.example.board.crud.domain.BoardEntity;
import com.example.board.crud.domain.repository.BoardRepository;
import com.example.board.crud.dto.Request.BoardRequest;
import com.example.board.crud.dto.Response.BoardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public String createBoard(BoardRequest boardRequest){
        boardRepository.save(BoardRequest.dtoToEntity(boardRequest));
        return "COMPLETED";
    }

    public BoardResponse readBoard(Long id){
        BoardEntity boardEntity = boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("id not found"));
        return BoardResponse.entityToDto(boardEntity);
    }

   
    public BoardResponse modifyBoard(Long id,BoardRequest boardRequest){
        BoardEntity boardEntity = boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("id not found"));
        boardEntity.changeTitle(boardRequest.getTitle());
        boardEntity.changeContent(boardRequest.getContent());
        boardRepository.save(boardEntity);
        return BoardResponse.entityToDto(boardEntity);
    }

    
    public BoardResponse deleteBoard(Long id){
        BoardEntity boardEntity = boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("id not found"));
        boardRepository.delete(boardEntity);
        return BoardResponse.entityToDto(boardEntity);
    }



}
