package com.microservice.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
public class BackEndSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndSpringCloudApplication.class, args);
	}

}
