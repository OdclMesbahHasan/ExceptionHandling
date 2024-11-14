package com.example.LearnExceptionHandling.exceptions;



public class PlainTextException extends RuntimeException {

    public PlainTextException(String message) {
        super(message);
    }

    public PlainTextException(String message, Throwable cause) {
        super(message, cause);
    }
}

