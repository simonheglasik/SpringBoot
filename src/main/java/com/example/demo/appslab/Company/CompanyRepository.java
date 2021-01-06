package com.example.demo.appslab.Company;

import com.example.demo.appslab.Company.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CompanyRepository extends CrudRepository<Company,String>
{

}
