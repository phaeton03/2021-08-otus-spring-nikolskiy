package ru.otus.spring2021;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring2021.service.QuestionService;


public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        QuestionService questionService = context.getBean(QuestionService.class);
        questionService.showQuestions();
    }
}
