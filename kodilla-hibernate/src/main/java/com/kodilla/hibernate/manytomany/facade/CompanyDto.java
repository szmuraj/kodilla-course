package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public CompanyDto() {
    }
    public CompanyDto(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
