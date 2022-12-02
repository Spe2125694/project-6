package com.example.dictionary.exception;

public class WordNotFoundException extends Exception {

    // Won't be used
    public WordNotFoundException() {
    }

    public WordNotFoundException(String message) {
        super(message);
    }

    // Won't be used
    public WordNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    // Won't be used
    public WordNotFoundException(Throwable cause) {
        super(cause);
    }
}
