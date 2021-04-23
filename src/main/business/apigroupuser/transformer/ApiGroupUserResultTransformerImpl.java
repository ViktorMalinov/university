package main.business.apigroupuser.transformer;

import main.dataaccess.apigroupuser.dao.ApiGroupUser;
import main.service.apigroupuser.ApiGroupUserResult;

public class ApiGroupUserResultTransformerImpl implements ApiGroupUserResultTransformer {

	@Override
	public ApiGroupUserResult transform(ApiGroupUser entity) throws Exception {
		ApiGroupUserResult result = new ApiGroupUserResult();
		
		result.setId(entity.getId());
		
		if (entity.getApiGroup() == null) {
			throw new Exception("The object API Group was NOT found!");
		}
		
		if (entity.getApiGroup().getDisplayName().isEmpty()) {
			throw new Exception("The Discipline NAME is empty!");
		}
		
		if (entity.getApiUser() == null) {
			throw new Exception("The object API User was NOT found!");
		}
		
		if (entity.getApiUser().getDisplayName().isEmpty()) {
			throw new Exception("The API User display NAME is empty!");
		}
		
		result.setApiGroupId(entity.getApiGroup().getId());
		result.setApiGroupDisplayName(entity.getApiGroup().getDisplayName());
		
		result.setApiUserId(entity.getApiUser().getId());
		result.setApiUserDisplayName(entity.getApiUser().getDisplayName());
		
		return result;
	}

}
