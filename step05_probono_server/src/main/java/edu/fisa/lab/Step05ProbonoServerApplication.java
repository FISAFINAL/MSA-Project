package edu.fisa.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Step05ProbonoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step05ProbonoServerApplication.class, args);
	}

}
