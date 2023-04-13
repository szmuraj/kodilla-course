package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {

    private int id;
    private String firstname;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public EmployeeDto() {
    }
    public EmployeeDto(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    private void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    private void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public List<Company> getCompanies() {
        return companies;
    }
    private void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
