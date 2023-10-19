package com.example.board.crud.dto.Request;

import com.example.board.crud.domain.BoardEntity;
import lombok.*;


@Getter
public class BoardRequest {
    private String title;
    private String content;

    public BoardEntity toEntity(){
        return BoardEntity.builder()
                .title(this.title)
                .content(this.content).build();
    }
}
