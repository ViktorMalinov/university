package main.business.apigroup.validator;

import main.service.apigroup.ApiGroupParam;

public class ApiGroupParamValidatorImpl implements ApiGroupParamValidator {

	@Override
	public void validate(ApiGroupParam param) throws Exception {

		if (param == null) {
			throw new Exception( "The object you want to manipulate was not found!" );
		}

	}

}
