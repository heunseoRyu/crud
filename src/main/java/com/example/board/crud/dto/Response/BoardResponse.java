package com.example.board.crud.dto.Response;

import com.example.board.crud.domain.BoardEntity;
import jdk.jshell.Snippet;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter // 둘이 바꿔
@AllArgsConstructor
public class BoardResponse {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public static BoardResponse of(BoardEntity boardEntity){
        return BoardResponse.builder()
                .id(boardEntity.getId())
                .title(boardEntity.getTitle())
                .content(boardEntity.getContent())
                .createdDate(boardEntity.getCreatedDate())
                .modifiedDate(boardEntity.getModifiedDate()).build();
    }



}
