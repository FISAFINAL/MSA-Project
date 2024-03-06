package edu.fisa.lab.probono.model;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fisa.lab.probono.exception.NotExistException;
import edu.fisa.lab.probono.model.dto.ProbonoProjectDTO;
import edu.fisa.lab.probono.model.entity.ProbonoProject;

@Service
public class ProbonoService {
	
	@Autowired
	private ProbonoProjectDAO probonoProjectDAO;	
	
	private ModelMapper mapper = new ModelMapper();
	
	/* 모든 프로젝트 검색
	 * entity와 dto 분리 필수 - ModelMapper 로 entity와 dto 호환
	 */
	public List<ProbonoProjectDTO> getAllProbonoProjects() throws SQLException,NotExistException{
		//List<T> findAll();
		/* DAO의 repository의 Entity 선언으로 인해 반환되는 List 내부의 객체 타입은 반드시 Entity 여야만 함
		 */
		List<ProbonoProject> probonoProjectAll = probonoProjectDAO.findAll();
		
		if(probonoProjectAll == null){
			throw new NotExistException("검색하는 재능기부 프로젝트가 미 존재합니다.");
		}
		
		List<ProbonoProjectDTO> probonoProjectDTOAll = Arrays.asList(mapper.map(probonoProjectAll, ProbonoProjectDTO[].class));
		
		return probonoProjectDTOAll;
	}
}
