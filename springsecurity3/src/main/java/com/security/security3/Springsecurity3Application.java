package com.security.security3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Springsecurity3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsecurity3Application.class, args);
	}

}
