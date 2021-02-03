package com.example.demo.appslab.Company;

import com.example.demo.appslab.Address;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController
{
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    CompanyService companyService;
    @PostMapping("/company")
    public void postController(@RequestBody Company Company)
    {
        companyService.saveCompany(Company);
    }
}
