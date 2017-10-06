package com.itmyhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceManageApplication.class, args);
	}
}
