package com.jalasoft.project.model.customer;

import com.jalasoft.project.model.enumeration.CustomerType;
import com.jalasoft.project.model.enumeration.Relation;
import com.jalasoft.project.model.enumeration.Status;

public abstract class Customer {
    private String id;
    private String description;
    private CustomerType customerType;
    private Relation relation;
    private Status status;

    public Customer(String id, String description, CustomerType customerType) {
        this.id = id;
        this.description = description;
        this.customerType = customerType;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType.toString();
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String save();
    public abstract String show();
}
