package com.jalasoft.project.controller.request;

import com.jalasoft.project.common.exception.InvalidDataException;
import org.springframework.web.multipart.MultipartFile;

public abstract class RequestParameter {
    private String id;
    private String description;
    private MultipartFile file;
    private String firstName;
    private String lastName;
    private String city;
    private String postalCode;

    public RequestParameter(String id, String description, MultipartFile file, String firstName, String lastName,
                            String city, String postalCode) {
        this.id = id;
        this.description = description;
        this.file = file;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public abstract void validate() throws InvalidDataException;
}
