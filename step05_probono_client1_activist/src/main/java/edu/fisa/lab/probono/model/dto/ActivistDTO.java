package edu.fisa.lab.probono.model.dto;

import edu.fisa.lab.probono.model.entity.Activist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter 
@Setter 
@ToString 

@Builder
public class ActivistDTO {

	private String id;
	private String name;
	private String password;
	private String major;

	public Activist toEntity() {
		return Activist.builder().id(id).name(name).password(password).major(major).build();
	}

}
  