package com.ks8_test.ks8_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ks8TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ks8TestApplication.class, args);
	}

	@GetMapping("/sayhello")
	public String sayHello(){
		return "Hello from spring boot.";
	}

}
