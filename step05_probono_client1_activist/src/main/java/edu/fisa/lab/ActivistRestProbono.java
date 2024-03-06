/*
 * 데이터를 제공하는 2에게 요청하는 핵심 클래스
 * 필요 정보
 * 1. url
 * 2. 요청 후 받은 데이터 처리
 * 	- StudentRestController에서 메서드 호출 
 * */
package edu.fisa.lab;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// 통신하고자 하는 서비스 이름, 서비스 url값(yml에 등록된 설정 정보)
@FeignClient(name="PROBONO-SERVICE", url="${spring.feign.probono.client}")
public interface ActivistRestProbono {
	
	@GetMapping("/probono/probonoProjectAll") // http://ip:port/book/data
	public String getBookSystemPort();

//	@GetMapping("/activist/all")
//	public String getAllBooks();
//
//	@GetMapping("/activist/{isbn}")
//	public String getBookById(@PathVariable("isbn") int isbn);

}
