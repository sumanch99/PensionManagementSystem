package com.cognizant.gpd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GeneratePensionerDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneratePensionerDetailsApplication.class, args);
	}

}
