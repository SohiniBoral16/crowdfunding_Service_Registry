package com.intuit.crowdfundingServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CrowdfundingServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrowdfundingServiceRegistryApplication.class, args);
	}

}
