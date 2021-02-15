package com.example.demo.appslab.Employee;

import com.example.demo.appslab.Company.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
@Component
public interface EmployeeRepository extends CrudRepository<Employee,String>{}
