package main.business.apiuser.validator;

import main.service.apiuser.ApiUserParam;

public class ApiUserParamValidatorImpl implements ApiUserParamValidator {

	@Override
	public void validate(ApiUserParam param) throws Exception {

		if (param == null) {
			throw new Exception( "Department param object you want to manipulate was not found!" );
		}

	}

}
