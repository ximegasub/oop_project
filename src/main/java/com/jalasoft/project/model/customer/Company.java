package com.jalasoft.project.model.customer;
import com.jalasoft.project.model.enumeration.CustomerType;
import com.jalasoft.project.model.result.FileResult;

public class Company extends Customer{
    private Details details;
    private Contact contact;
    private String name;
    private String phone;
    private String fax;

    public Company(String id, String description){
        super(id, description, CustomerType.COMPANY);
    }


    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String save() {
        String result = new FileResult().writeToFile(this.show());
        return result;
    }

    @Override
    public String show() {
        return String.format(
                "Company Customer[id=%s, description='%s', companyName='%s', companyPhone=%s, firstName='%s'," +
                " lastName='%s', city='%s', postalCode=%s]",
                this.getId(), this.getDescription(), this.name, this.phone, this.getContact().getFirstName(),
                this.getContact().getLastName(), this.getDetails().getCity(), this.getDetails().getPostalCode());
    }

}
