package com.example.board.crud.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class BoardEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45,nullable = false)
    private String title;

    @Column(length = 500,nullable = false)
    private String content;

    public void changeTitle(String data){
        this.title = data;
    }
    public void changeContent(String data){
        this.content = data;
    }

    @Builder
    public BoardEntity(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
