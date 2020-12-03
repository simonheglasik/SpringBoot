package com.example.demo.appslab.model;

public class Programmer extends job
{
    public Programmer(float salary , int bonus)
    {
        this.salary = salary;
        this.bonus = bonus;
        this.jobType = type.programmer;
    }
     @Override
     public String getInfo()
    {
        return jobType + "'s salary is " + (salary + bonus);
    }
}
