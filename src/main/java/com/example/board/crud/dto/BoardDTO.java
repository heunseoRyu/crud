package com.example.board.crud.dto;

import lombok.*;

import javax.accessibility.AccessibleState;
import javax.swing.*;
import java.time.LocalDateTime;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class BoardDTO {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
}
