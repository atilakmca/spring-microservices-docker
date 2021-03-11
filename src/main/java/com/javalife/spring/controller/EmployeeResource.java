package com.javalife.spring.controller;


import com.javalife.spring.model.Employee;
import com.javalife.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static javax.security.auth.callback.ConfirmationCallback.OK;

@RestController
public class EmployeeResource {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseBody getEmployees(@RequestBody Employee employee){


                employeeService.getEmployeeList();

        return null;
    }

}
