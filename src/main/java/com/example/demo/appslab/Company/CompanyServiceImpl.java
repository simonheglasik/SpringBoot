package com.example.demo.appslab.Company;

import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService
{
    CompanyRepository companyRep;
    private CompanyServiceImpl(CompanyRepository companyRep)
    {
        this.companyRep = companyRep;
    }
    @Override
    public void saveCompany(Company company)
    {
        companyRep.save(company);
    }
}
