package main.business.apigroupuser.transformer;

import main.dataaccess.apigroupuser.ApiGroupUser;
import main.service.apigroupuser.ApiGroupUserResult;

public class ApiGroupUserResultTransformerImpl implements ApiGroupUserResultTransformer {

	@Override
	public ApiGroupUserResult transform(ApiGroupUser entity) {
		ApiGroupUserResult result = new ApiGroupUserResult();
		
		result.setId(entity.getId());
		result.setApiGroupId(entity.getApiGroupId());
		result.setApiUserId(entity.getApiUserId());
		
		return result;
	}

}
