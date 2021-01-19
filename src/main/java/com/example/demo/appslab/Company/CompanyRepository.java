package com.example.demo.appslab.Company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface CompanyRepository extends CrudRepository<Company,String>{

}

