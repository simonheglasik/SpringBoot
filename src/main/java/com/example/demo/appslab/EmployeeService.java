package com.example.demo.appslab;
import com.example.demo.appslab.model.job;

import java.util.ArrayList;
import java.util.List;
public interface EmployeeService
{
    double sumAllSalaries(List<job> jobs);
    int sumAllBunuses(List<job> jobs);

}
