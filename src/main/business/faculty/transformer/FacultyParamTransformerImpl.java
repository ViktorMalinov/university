package main.business.faculty.transformer;

import main.business.common.BaseParamValidatorImpl;
import main.business.faculty.validator.FacultyParamValidatorImpl;
import main.dataaccess.faculty.dao.Faculty;
import main.service.faculty.FacultyParam;

public class FacultyParamTransformerImpl implements FacultyParamTransformer {

	private BaseParamValidatorImpl <FacultyParam> validator = new FacultyParamValidatorImpl();
		
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
