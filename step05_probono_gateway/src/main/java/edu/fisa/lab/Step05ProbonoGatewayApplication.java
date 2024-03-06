package edu.fisa.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Step05ProbonoGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step05ProbonoGatewayApplication.class, args);
	}

}
