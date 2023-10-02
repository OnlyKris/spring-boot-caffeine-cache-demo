package com.example.springbootcaffeinedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class SpringBootCaffeineDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCaffeineDemoApplication.class, args);
	}

}
