package com.example.demo.appslab;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company<C, S> {
    @Id
    public long id;
    public String name;
}
