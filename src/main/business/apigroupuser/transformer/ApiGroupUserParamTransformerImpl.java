package main.business.apigroupuser.transformer;

import main.dataaccess.apigroupuser.ApiGroupUser;
import main.service.apigroupuser.ApiGroupUserParam;

public class ApiGroupUserParamTransformerImpl implements ApiGroupUserParamTransformer {

	@Override
	public ApiGroupUser transform(ApiGroupUserParam param) {
		ApiGroupUser entity = new ApiGroupUser();
		
		entity.setId(param.getId());
		entity.setApiGroupId(param.getApiGroupId());
		entity.setApiUserId(param.getApiUserId());
		
		return entity;
	}

}
