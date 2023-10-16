package com.example.board.crud.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Table(name = "tb_board")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45,nullable = false)
    private String title;

    @Column(length = 500,nullable = false)
    private String content;


}
