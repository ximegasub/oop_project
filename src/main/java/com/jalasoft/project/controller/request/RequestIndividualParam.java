package com.jalasoft.project.controller.request;

import com.jalasoft.project.common.exception.InvalidDataException;
import com.jalasoft.project.common.validation.IValidationStrategy;
import com.jalasoft.project.common.validation.MultipartFileValidation;
import com.jalasoft.project.common.validation.NotNullOrEmptyValidation;
import com.jalasoft.project.common.validation.ValidationContext;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

public class RequestIndividualParam extends RequestParameter{

    public RequestIndividualParam(String id, String description, MultipartFile file,
                                  String firstName, String lastName, String city,
                                  String postalCode){
        super(id, description, file, firstName, lastName, city, postalCode);
    }

    public void validate() throws InvalidDataException {
        List<IValidationStrategy> validationStrategies = new ArrayList<>();
        validationStrategies.add(new NotNullOrEmptyValidation("id", this.getId()));
        validationStrategies.add(new NotNullOrEmptyValidation("description", this.getDescription()));
        validationStrategies.add(new MultipartFileValidation(this.getFile()));
        validationStrategies.add(new NotNullOrEmptyValidation("firstName", this.getFirstName()));
        validationStrategies.add(new NotNullOrEmptyValidation("LastName", this.getLastName()));
        validationStrategies.add(new NotNullOrEmptyValidation("city", this.getCity()));
        validationStrategies.add(new NotNullOrEmptyValidation("postalCode", this.getPostalCode()));
        ValidationContext context = new ValidationContext(validationStrategies);
        context.validation();
    }
}
