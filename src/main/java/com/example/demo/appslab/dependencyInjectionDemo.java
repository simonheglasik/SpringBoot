package com.example.demo.appslab;

import com.example.demo.appslab.model.job;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class dependencyInjectionDemo
{
    private EmployeeService ser;
    public dependencyInjectionDemo(EmployeeService ser)
    {
        this.ser = ser;
        var list = new ArrayList<job>();
        System.out.println(getSum(list));
        ((EmployeeServiceImpl)ser).writeNumber();
    }
    public double getSum(List<job> list)
    {
        return ser.sumAllBunuses(list) + ser.sumAllSalaries(list);
    }
}
