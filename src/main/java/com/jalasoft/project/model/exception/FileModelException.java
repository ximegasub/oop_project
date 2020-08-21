package com.jalasoft.project.model.exception;

import java.io.File;

public class FileModelException extends Exception {
    private static final String MESSAGE = "An error occurred when saving data.";

    public FileModelException() {
        super(MESSAGE);
    }

    public FileModelException(Throwable ex) {
        super(MESSAGE, ex);
    }

    public FileModelException(String currantMessage, Throwable ex) {
        super(currantMessage, ex);
    }

    public FileModelException(String currentMessage) {
        super(currentMessage);
    }

}
