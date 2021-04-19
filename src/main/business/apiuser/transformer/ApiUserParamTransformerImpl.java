package main.business.apiuser.transformer;

import main.dataaccess.apiuser.ApiUser;
import main.service.apiuser.ApiUserParam;

public class ApiUserParamTransformerImpl implements ApiUserParamTransformer {

	@Override
	public ApiUser transform(ApiUserParam param) {
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
