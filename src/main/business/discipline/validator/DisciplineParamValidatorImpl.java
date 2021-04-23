package main.business.discipline.validator;

import main.service.discipline.DisciplineParam;

public class DisciplineParamValidatorImpl implements DisciplineParamValidator {

	@Override
	public void validate(DisciplineParam param) throws Exception {
		
		if (param == null) {
			throw new Exception( "Department param object you want to manipulate was not found!" );
		}
	}

}
