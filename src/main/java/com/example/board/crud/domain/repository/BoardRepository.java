package com.example.board.crud.domain.repository;

import com.example.board.crud.domain.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity,Long> {

}