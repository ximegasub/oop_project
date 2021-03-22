package com.jalasoft.project.model.builder;

import com.jalasoft.project.model.customer.Company;
import com.jalasoft.project.model.customer.Contact;
import com.jalasoft.project.model.customer.Details;

public class CompanyBuilder implements ICustomerBuilder{
    private Company company;

    public CompanyBuilder(String id, String description){
        this.company = new Company(id, description);
    }

    public CompanyBuilder withName(String name){
        this.company.setName(name);
        return this;
    }

    public CompanyBuilder withPhone(String phone){
        this.company.setPhone(phone);
        return this;
    }

    public CompanyBuilder withFax(String fax){
        this.company.setFax(fax);
        return this;
    }

    public CompanyBuilder withContact(String firstName, String lastName){
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        this.company.setContact(contact);
        return this;
    }

    public CompanyBuilder withDetails(String city, String postalCode){
        Details details = new Details();
        details.setCity(city);
        details.setPostalCode(postalCode);
        this.company.setDetails(details);
        return this;
    }

    public Company build() {
        return this.company;
    }
}
