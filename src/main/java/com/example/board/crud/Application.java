package com.example.board.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 중요! 실수로 yml을 지운다면 형벌이 내려짐.
@SpringBootApplication
@EnableJpaAuditing // jpa auditing 활성화
// 2트 : 브랜치 바꿈
// u
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
