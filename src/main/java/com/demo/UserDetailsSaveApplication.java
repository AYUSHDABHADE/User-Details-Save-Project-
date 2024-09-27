package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserDetailsSaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDetailsSaveApplication.class, args);
		System.err.println("Application is running");
		System.out.println("Application fast running");
	}

}
