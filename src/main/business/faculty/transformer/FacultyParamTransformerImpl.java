package main.business.faculty.transformer;

import main.dataaccess.faculty.Faculty;
import main.service.faculty.FacultyParam;

public class FacultyParamTransformerImpl implements FacultyParamTransformer {

	@Override
	public Faculty transform(FacultyParam param) {
		Faculty entity = new Faculty();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		return entity;
	}

}
