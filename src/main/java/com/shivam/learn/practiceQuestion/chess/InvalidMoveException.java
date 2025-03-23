package com.shivam.learn.practiceQuestion.chess;

public class InvalidMoveException extends RuntimeException {
    public InvalidMoveException(final String message) {
        super(message);
    }
}
