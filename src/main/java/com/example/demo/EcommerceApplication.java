package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	//This is messing with spring security password verification
//    @Bean
//    BCryptPasswordEncoder passwordEncoder() {
//	    return new BCryptPasswordEncoder();
//	}

}
