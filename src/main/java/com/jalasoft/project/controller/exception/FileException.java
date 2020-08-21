package com.jalasoft.project.controller.exception;

public class FileException extends Exception {
    private static final String MESSAGE = "Error.";

    public FileException() {
        super(MESSAGE);
    }

    public FileException(Throwable ex) {
        super(MESSAGE, ex);
    }

    public FileException(String currantMessage, Throwable ex) {
        super(currantMessage, ex);
    }

    public FileException(String currentMessage) {
        super(currentMessage);
    }
}