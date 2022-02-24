package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringWithJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithJenkinsApplication.class, args);
	}
	
	@GetMapping("/sample-api")
	public String sample_api() {
		return "Spring Boot + Jenkins";
	}

}
