package com.javalife.spring.service;

import com.javalife.spring.model.Address;
import com.javalife.spring.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getEmployeeList() {

       Employee.builder()
               .address(Address.builder()
                       .addressline1("123 NewYork St")
                       .addressline2("")
                       .state("illinois")
                       .city("Aurora")
                       .zipcode("60504").build())
               .deptName("Computers")
               .empid("0011")
               .empName("Alice")
               .build();


        return null;
    }

    @Override
    public Employee getEmployeeById() {
        return null;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }
}
