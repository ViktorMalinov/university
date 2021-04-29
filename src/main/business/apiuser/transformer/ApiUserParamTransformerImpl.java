package main.business.apiuser.transformer;

import main.business.apiuser.validator.ApiUserParamValidatorImpl;
import main.business.common.BaseParamValidatorImpl;
import main.dataaccess.apiuser.dao.ApiUser;
import main.service.apiuser.ApiUserParam;

public class ApiUserParamTransformerImpl implements ApiUserParamTransformer {

	private BaseParamValidatorImpl <ApiUserParam> validator = new ApiUserParamValidatorImpl();
	
	@Override
	public ApiUser transform(ApiUserParam param) throws Exception {
		validator.validate(param);		
		
		ApiUser entity = new ApiUser();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setDisplayName(param.getDisplayName());
		entity.setEmail(param.getEmail());
		entity.setPassword(param.getPassword());		
		entity.setUsername(param.getUsername());
		
		
		return entity;
	}

}
