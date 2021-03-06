package ru.otus.spring.homework_32;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// url h2 консоли: http://localhost:8080/h2-console
// url базы: jdbc:h2:mem:testdb

@SpringBootApplication
@EnableJpaAuditing
public class Homework32Application {
    public static void main(String[] args) {
        SpringApplication.run(Homework32Application.class);
    }
}