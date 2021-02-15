package com.example.demo.appslab.Employee;


import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
public class EmployeeController
{
    private EmployeeService ser;
    public EmployeeController(EmployeeService ser)
    {
        this.ser = ser;
    }
    @PostMapping("/employee")
    public void postEmployee(@RequestBody List<Employee> employees)
    {
        employees.stream().forEach(n -> ser.saveEmployee(n));
    }
}
