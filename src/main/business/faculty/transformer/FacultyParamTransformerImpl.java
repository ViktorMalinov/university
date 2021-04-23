package main.business.faculty.transformer;

import main.business.faculty.validator.FacultyParamValidator;
import main.business.faculty.validator.FacultyParamValidatorImpl;
import main.dataaccess.faculty.Faculty;
import main.service.faculty.FacultyParam;

public class FacultyParamTransformerImpl implements FacultyParamTransformer {

	private FacultyParamValidator validator = new FacultyParamValidatorImpl();
		
	@Override
	public Faculty transform(FacultyParam param) throws Exception {
		
		validator.validate(param);
		
		Faculty entity = new Faculty();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		return entity;
	}

}
