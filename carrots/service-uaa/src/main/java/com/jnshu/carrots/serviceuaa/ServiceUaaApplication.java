package com.jnshu.carrots.serviceuaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceUaaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceUaaApplication.class, args);
	}
}
