package com.javalife.spring.service;

import com.javalife.spring.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployeeList();
    Employee getEmployeeById();
    Employee saveEmployee(Employee employee);
}
