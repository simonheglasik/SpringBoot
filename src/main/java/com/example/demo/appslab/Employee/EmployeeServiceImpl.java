package com.example.demo.appslab.Employee;
import com.example.demo.appslab.Employee.EmployeeService;
import com.example.demo.appslab.model.job;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService
{
    double number;
   EmployeeRepository rep;
    public EmployeeServiceImpl(EmployeeRepository rep)
    {
        this.rep = rep;
    }
    public void writeNumber()
    {
        System.out.println(++this.number);
    }
    @Override
    public double sumAllSalaries(List<job> jobs) {
        return jobs.stream().mapToDouble(job::getSalary).sum();
    }

    @Override
    public int sumAllBunuses(List<job> jobs) {
        return jobs.stream().mapToInt(job::getBonus).sum();
    }

    @Override
    public void saveEmployee(Employee employee) {
        rep.save(employee);
    }
}
