package com.jalasoft.project.model.customer;


import com.jalasoft.project.model.enumeration.CustomerType;
import com.jalasoft.project.model.result.FileResult;

public class Individual extends Customer{
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private Details details;

    public Individual(String id, String description){
        super(id, description, CustomerType.INDIVIDUAL);
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String save() {
        String result = new FileResult().writeToFile(this.show());
        return result;
    }

    @Override
    public String show() {
        return String.format(
                "Individual Customer[id=%s, description='%s', firstName='%s', lastName='%s', city='%s', postalCode=%s]",
                this.getId(), this.getDescription(), this.firstName, this.lastName, this.getDetails().getCity(),
                this.getDetails().getPostalCode());
    }
}
