package com.javacampus.helloworld2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Helloworld2Application {

	@GetMapping(value="/")
	public String index() {
		return "Hello World2 Spring Boot entry point";
	}

	public static void main(String[] args) {
		SpringApplication.run(Helloworld2Application.class, args);
	}

}
