package com.example.board.crud.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Table(name = "tb_board")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
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

}
