package com.reset.ServiceA.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class ServiceAApplication {

	
	@GetMapping("/greet")
	public ResponseEntity<String> greet(){
		return ResponseEntity.ok("Hello from Service A");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}

}
