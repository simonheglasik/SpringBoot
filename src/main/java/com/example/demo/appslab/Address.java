package com.example.demo.appslab;

import com.example.demo.appslab.Company.Company;

import javax.persistence.*;

@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String street;
    private String zipCode;
    private String city;
    private String state;
    @OneToOne(mappedBy = "address")
    private com.example.demo.appslab.Company.Company Company;

    public Address(String street, String zipCode, String city, String state)
    {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
