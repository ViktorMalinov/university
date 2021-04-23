package main.business.department.validator;

import main.service.department.DepartmentParam;

public class DepartmentParamValidatorImpl implements DepartmentParamValidator {

	@Override
	public void validate(DepartmentParam param) throws Exception {
		
		if (param == null) {
			throw new Exception( "The object you want to manipulate was not found!" );
		}


	}

}
