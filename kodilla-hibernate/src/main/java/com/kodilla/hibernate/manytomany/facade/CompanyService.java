package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CompanyService {

    final CompanyDao companyDao;
    final EmployeeDao   employeeDao;

    void findCompanyByFirstThreeLetters(String letters) {
        companyDao.findByFirstThreeLetters(letters);
    }

    void findEmployeeByLastname(Employee lastname) {
        employeeDao.findByLastname();
    }
}
