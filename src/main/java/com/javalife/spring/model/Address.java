package com.javalife.spring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {

    private String addressline1;
    private String addressline2;
    private String city;
    private String state;
    private String zipcode;
}
