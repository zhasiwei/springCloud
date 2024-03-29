package com.geek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider8001_Application {

	public static void main(String[] args) {
		SpringApplication.run(Provider8001_Application.class, args);
	}
}
