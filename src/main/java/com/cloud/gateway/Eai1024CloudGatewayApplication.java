package com.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Eai1024CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Eai1024CloudGatewayApplication.class, args);
	}

}
