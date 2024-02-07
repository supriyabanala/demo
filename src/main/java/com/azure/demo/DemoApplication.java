package com.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/azure")
	public String demo(){
		return "Successfully deployed app on azure !";
	}
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}
