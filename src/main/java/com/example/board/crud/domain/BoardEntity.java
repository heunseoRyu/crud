package com.example.board.crud.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_board")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private Long title;

    @Column(length = 500,nullable = false)
    private Long content;


}
