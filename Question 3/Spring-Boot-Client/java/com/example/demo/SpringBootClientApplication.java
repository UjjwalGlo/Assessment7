package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootClientApplication.class, args);
	}

	@GetMapping

	public String hello() {

		return "First Eureka Client Application..............";

	}
}
