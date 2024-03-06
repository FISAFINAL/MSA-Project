package edu.fisa.lab.probono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.fisa.lab.ActivistRestProbono;
import edu.fisa.lab.probono.model.ProbonoService;
import edu.fisa.lab.probono.model.dto.ActivistDTO;

//jsp 없이 응답 데이터를 문자열화해서 바로 요청한 영역으로 출력
//문자열 구조 - DTO가 응답시 JSON 포멧의 문자열, List 응답시 JSON 배열 형식의 문자열로 응답
//비동기로 개발 권장
@RestController
@RequestMapping("/activist")
public class ProbonoRestController {

	@Autowired
	ProbonoService probonoService;
	
	@Autowired
	private ActivistRestProbono probono;

	@GetMapping("/activistAll")
	public List<ActivistDTO> activistAll() throws Exception {
		return probonoService.getAllActivists();
	}

	//한명의 기부자 검색
	//activist?id=값
	@GetMapping("/activist")
	public ActivistDTO activist(@RequestParam("id") String activistId) throws Exception {
		return probonoService.getActivist(activistId); //json 포멧으로 client의 js 요청 영역으로 출력
	}

	@PostMapping("/activistInsert")
	protected String activistInsert(ActivistDTO activist) throws Exception {
		boolean result = probonoService.addActivist(activist);
		return result ? "기부자 가입 완료" : "가입실패";
	}
	
	/*
	 * MSA feign client을 사용하는 기능
	 * */
	@GetMapping("/data")
	public String getBookSystemPortInfo() {
		return "고객 소비자가 책 공급자로 부터 받은 책정보 제공 System의 port 번호 : " 
				+ probono.getBookSystemPort();
	}

}
