package com.example.demo.appslab.model;

public class job
{
    public enum type
    {
        programmer,
        driver,
        teacher;
    }
    protected type jobType;
    protected float salary;
    protected int bonus;

    public type getJobType() {
        return jobType;
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public String getInfo()
    {
        return jobType + "'s" + " salary is " + salary + " and bonus is " + bonus;
    }
}
