package com.example.demo.appslab.model;

import com.example.demo.appslab.EmployeeService;
import com.example.demo.appslab.EmployeeServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class Dpdnc
{
     private EmployeeService ser ;

    public Dpdnc(EmployeeService ser)
    {
        this.ser = ser;
        ((EmployeeServiceImpl)ser).writeNumber();
    }
}
