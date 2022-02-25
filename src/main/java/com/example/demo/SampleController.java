package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
	
	
	@Value("${spring.application.name}")
    String appName;

    @GetMapping("/appName")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    
    }
    
    
    @GetMapping("/sample")
	public String sample_api() {
		return ""
				+ "Welcome you are successfully created your first jenkins"
				+ "jobs, integrated with maven and java spring boot project"
				+ "Spring Boot + Jenkins";
	}
	
}
