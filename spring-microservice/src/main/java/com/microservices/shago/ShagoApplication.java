package com.microservices.shago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class ShagoApplication {

	@GetMapping ("/weatherForecast")
	public String getMessage() {
		return "Hola! esto es un microservicio desplegado con docker en springboot";
	}

	public static void main(String[] args) {
		SpringApplication.run(ShagoApplication.class, args);
	}

}
