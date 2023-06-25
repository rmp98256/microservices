package com.mayur.Gateway.Api.Gateay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGateayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateayApplication.class, args);
	}

}
