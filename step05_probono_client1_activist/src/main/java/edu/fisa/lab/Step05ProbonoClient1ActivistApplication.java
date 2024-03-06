package edu.fisa.lab;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Step05ProbonoClient1ActivistApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step05ProbonoClient1ActivistApplication.class, args);
	}

}
