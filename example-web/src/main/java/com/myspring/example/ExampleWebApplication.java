package com.myspring.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ExampleWebApplication {
	@RequestMapping("/")
	String home() {
		return "Hello World! myspring";
	}

	public static void main(String[] args) {
		SpringApplication.run(ExampleWebApplication.class, args);
	}
}
