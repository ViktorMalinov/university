package main.business.department.validator;

import main.common.Validator;

public class BusinessDepartmentValidatorImpl<T> implements Validator<T> {

	@Override
	public void validate(T param, String exceptionMessage) throws Exception {
		
		if (param == null) {
			throw new Exception( exceptionMessage );
		}
		
	}

}
