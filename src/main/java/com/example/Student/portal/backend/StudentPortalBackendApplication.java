package com.example.Student.portal.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentPortalBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentPortalBackendApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello World";
	}
}
