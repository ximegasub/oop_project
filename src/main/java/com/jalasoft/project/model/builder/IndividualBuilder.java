package com.jalasoft.project.model.builder;

import com.jalasoft.project.model.customer.Details;
import com.jalasoft.project.model.customer.Individual;

public class IndividualBuilder implements ICustomerBuilder{
    private Individual individual;

    public IndividualBuilder(String id, String description){
        this.individual = new Individual(id, description);
    }

    public IndividualBuilder withFirstName(String firstName){
        this.individual.setFirstName(firstName);
        return this;
    }

    public IndividualBuilder withLastName(String lastName){
        this.individual.setLastName(lastName);
        return this;
    }

    public IndividualBuilder withMiddleName(String middleName){
        this.individual.setMiddleName(middleName);
        return this;
    }

    public IndividualBuilder withEmail(String email){
        this.individual.setEmail(email);
        return this;
    }

    public IndividualBuilder withPhone(String phone){
        this.individual.setPhone(phone);
        return this;
    }

    public IndividualBuilder withDetails(String city, String postalCode){
        Details details = new Details();
        details.setCity(city);
        details.setPostalCode(postalCode);
        this.individual.setDetails(details);
        return this;
    }

    public Individual build(){
        return this.individual;
    }
}
