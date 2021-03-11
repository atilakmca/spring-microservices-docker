package com.javalife.spring.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
 public class Employee {

    private String empid;
    private String empName;
    private String deptName;
    private Address address;


}
