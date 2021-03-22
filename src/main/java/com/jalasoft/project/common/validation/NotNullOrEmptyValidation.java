package com.jalasoft.project.common.validation;

import com.jalasoft.project.common.exception.InvalidDataException;

/**
 * @author HP
 * @version 1.1
 */
public class NotNullOrEmptyValidation implements IValidationStrategy {
    private String value;
    private String field;

    public NotNullOrEmptyValidation(String field, String value) {
        this.field = field;
        this.value = value;
    }

    @Override
    public void validate() throws InvalidDataException {
        if (this.value == null || this.value.trim().isEmpty() || this.value == "null") {
            throw new InvalidDataException("Invalid data on field = " + this.field);
        }
    }
}
