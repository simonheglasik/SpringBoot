package com.example.demo.appslab.Company;

import com.example.demo.appslab.Address;
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
        var adr = new Address("A.Bernoláka","0000","Žilina","Slovakia");
        var comp = new Company<>("Mena", adr);
        companyService.saveCompany(comp);
    }
}
