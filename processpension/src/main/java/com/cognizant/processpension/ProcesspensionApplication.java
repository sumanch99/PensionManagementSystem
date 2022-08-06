package com.cognizant.processpension;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ProcesspensionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcesspensionApplication.class, args);
	}

}
