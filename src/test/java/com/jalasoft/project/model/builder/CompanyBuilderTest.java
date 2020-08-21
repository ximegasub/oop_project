package com.jalasoft.project.model.builder;

import com.jalasoft.project.model.customer.Company;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompanyBuilderTest {

    @Test
    public void withContact() {
        String firstName = "name_test";
        String lastName = "last_name_test";
        Company company = new CompanyBuilder("test", "this is a test")
                .withContact(firstName, lastName)
                .build();
        assertEquals(firstName, company.getContact().getFirstName());
        assertEquals(lastName, company.getContact().getLastName());
    }


    @Test
    public void withDetails() {
        String city = "city_test";
        String postalCode = "postalCode_test";
        Company company = new CompanyBuilder("test", "this is a test")
                .withDetails(city, postalCode)
                .build();
        assertEquals(city, company.getDetails().getCity());
        assertEquals(postalCode, company.getDetails().getPostalCode());
    }
}