package ru.otus.spring.homework_32.exception.root;

public class HomeworkRootException extends RuntimeException {
    public HomeworkRootException() {
    }

    public HomeworkRootException(String message) {
        super(message);
    }
}