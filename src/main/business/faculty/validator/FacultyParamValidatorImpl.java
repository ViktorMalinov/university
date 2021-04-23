package main.business.faculty.validator;

import main.service.faculty.FacultyParam;

public class FacultyParamValidatorImpl implements FacultyParamValidator {

	@Override
	public void validate(FacultyParam param) throws Exception {
		
		if (param == null) {
			throw new Exception( "Department param object you want to manipulate was not found!" );
		}
		
	}

}
