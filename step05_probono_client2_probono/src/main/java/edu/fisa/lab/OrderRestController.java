package edu.fisa.lab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class OrderRestController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/order/info")
	public String showOrderInfo() {
		log.info("order -------------");
		return "order 서버의 port : " + port;
	}

}
