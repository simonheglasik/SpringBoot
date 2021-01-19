package com.example.demo;

import com.example.demo.appslab.Employee.EmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication
{
	public static void main(String[] args)
	{
		var con = SpringApplication.run(DemoApplication.class,args);
		var c = con.getBean(EmployeeServiceImpl.class);
		c.writeNumber();
	}
}
