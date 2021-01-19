package com.example.demo.appslab.Employee;

import com.example.demo.appslab.Snail;
import com.example.demo.appslab.model.Driver;
import com.example.demo.appslab.model.Programmer;
import com.example.demo.appslab.model.Teacher;
import com.example.demo.appslab.model.job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@RestController
public class EmployeeController
{
    private EmployeeService ser;
    List list = new ArrayList<job>();
    public EmployeeController(EmployeeService ser)
    {
        this.ser = ser;
        Collections.addAll(this.list,new Driver(500,200),new Teacher(333,222),new Programmer(333,444));
    }
    @GetMapping("/")
    String hello()
    {
      return "Hello world";
    }
    @GetMapping("/salary")
    double salary()
    {
        return ser.sumAllSalaries(list);
    }
    @GetMapping("/bonus")
    float bonus()
    {
        return ser.sumAllBunuses(list);
    }
    @GetMapping("/snail")
    float snail(@RequestParam double a, @RequestParam double b,@RequestParam double c)
    {
        return(float) Snail.snail(a,b,c);
    }
}
