package com.jnshu.carrots.serviceadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @Author 李景磊
 * @Description 
 * @Date 2018/9/28 1:29 
 * @Param 
 * @return 
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ServiceAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceAdminApplication.class, args);
	}
}
