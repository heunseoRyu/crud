package com.example.board.crud.service;

import com.example.board.crud.domain.BoardEntity;
import com.example.board.crud.domain.repository.BoardRepository;
import com.example.board.crud.dto.BoardDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BoardService implements BoardServiceImpl {
    @Autowired
    BoardRepository boardRepository;
    @Override
    public void createBoard(BoardDTO boardDTO){
        boardRepository.save(dtoToEntity(boardDTO));
    }

    @Override
    public BoardDTO readBoard(Long id){
        Optional<BoardEntity> temp = boardRepository.findById(id);
        if (temp.isPresent()) return entityToDto(temp.get());
        return null;
    }

    @Override
    public BoardDTO modifyBoard(Long id,BoardDTO boardDTO){
        Optional<BoardEntity> temp = boardRepository.findById(id);
        if(temp.isPresent()){
            BoardEntity boardEntity = temp.get();
            boardEntity.changeTitle(boardDTO.getTitle());
            boardEntity.changeContent(boardDTO.getContent());
            boardRepository.save(boardEntity);
            return entityToDto(boardEntity);
        }
        return null;

    }

    @Override
    public BoardDTO deleteBoard(Long id){
        Optional<BoardEntity> temp = boardRepository.findById(id);
        if(temp.isPresent()){
            boardRepository.delete(temp.get());
            return entityToDto(temp.get());
        }
        return null;
    }



}
