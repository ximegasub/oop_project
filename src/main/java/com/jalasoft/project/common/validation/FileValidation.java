package com.jalasoft.project.common.validation;

import com.jalasoft.project.common.exception.InvalidDataException;

import java.io.File;

/**
 * @author HP
 * @version 1.1
 */
public class FileValidation implements IValidationStrategy {
    private File file;

    public  FileValidation(File file) {
        this.file = file;
    }

    @Override
    public void validate() throws InvalidDataException {
        if (this.file == null || !this.file.isFile()) {
            throw new InvalidDataException("Invalid File");
        }
    }
}
