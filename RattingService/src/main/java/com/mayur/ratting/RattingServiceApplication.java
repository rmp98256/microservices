package com.mayur.ratting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RattingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RattingServiceApplication.class, args);
	}

}
