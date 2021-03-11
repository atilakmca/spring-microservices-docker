package com.javalife.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDockerApplication.class, args);
		System.out.println("Applcation to demo microservices and docker");
	}

}
