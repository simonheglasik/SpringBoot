package com.example.demo.appslab.Company;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CompanyController
{
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    CompanyService companyService;
    @GetMapping("/company")
    void save()
    {
        var comp = new Company<>();
        comp.setName("Peter");
        companyService.saveCompany(comp);
    }
}
