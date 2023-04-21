package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

@Service
@EnableAspectJAutoProxy
public class CompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);
    private final CompanyService companyService;
    @Autowired
    public CompanyFacade(CompanyService companyService) {
        this.companyService = companyService;
    }

    public String findCompany(String threeLetters) {
        Company company = new Company();
        if(company.getName().contains(threeLetters)) {
            return company.getName();
        }
        return "There are no such company";
    }
}
