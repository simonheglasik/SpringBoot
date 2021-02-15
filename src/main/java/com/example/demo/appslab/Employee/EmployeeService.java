package com.example.demo.appslab.Employee;
import com.example.demo.appslab.model.job;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
public interface EmployeeService
{
    double sumAllSalaries(List<job> jobs);
    int sumAllBunuses(List<job> jobs);
    void saveEmployee(Employee employee);

}
