package com.example.demo.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class Customer extends Person implements Serializable{
    private Address address;
    public Customer(){}

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
