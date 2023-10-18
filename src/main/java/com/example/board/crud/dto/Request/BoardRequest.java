package com.example.board.crud.dto.Request;

import com.example.board.crud.domain.BoardEntity;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
public class BoardRequest {
    private String title;
    private String content;

    public static BoardEntity dtoToEntity(BoardRequest boardRequest){
        return BoardEntity.builder()
                .title(boardRequest.getTitle())
                .content(boardRequest.getContent()).build();
    }
}
