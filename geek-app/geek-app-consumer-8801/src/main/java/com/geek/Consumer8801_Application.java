package com.geek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Consumer8801_Application {

	public static void main(String[] args) {
		SpringApplication.run(Consumer8801_Application.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate initRestTemplate() {
		return new RestTemplate();
	}
}
