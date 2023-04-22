package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@EnableAspectJAutoProxy
public class CompanyFacade {
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public CompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> getCompaniesWithNamesContaining(String str) {
        return companyDao.findByFirstThreeLetters(str);
    }

    public List<Employee> getEmployeesWithNamesContaining(String str) {
        return employeeDao.findByLastname(str);
    }
}
