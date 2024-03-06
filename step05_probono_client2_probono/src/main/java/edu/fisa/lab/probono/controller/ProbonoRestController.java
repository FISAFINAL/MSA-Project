package edu.fisa.lab.probono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.fisa.lab.probono.model.ProbonoService;
import edu.fisa.lab.probono.model.dto.ProbonoProjectDTO;

//jsp 없이 응답 데이터를 문자열화해서 바로 요청한 영역으로 출력
//문자열 구조 - DTO가 응답시 JSON 포멧의 문자열, List 응답시 JSON 배열 형식의 문자열로 응답
//비동기로 개발 권장
@RestController
@RequestMapping("/probono")
public class ProbonoRestController {

	@Autowired
	ProbonoService probonoService;

	//http://ip:port/context/path
	//http://127.0.0.1:80/probono/probonoProjectAll
	// 모든 ProbonoProject 검색 메소드
	@GetMapping("/probonoProjectAll")
	public List<ProbonoProjectDTO> probonoProjectAll() throws Exception {
		return probonoService.getAllProbonoProjects();
	}
	
}
