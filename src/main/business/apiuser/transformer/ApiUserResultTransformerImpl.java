package main.business.apiuser.transformer;

import main.dataaccess.apiuser.dao.ApiUser;
import main.service.apiuser.ApiUserResult;

public class ApiUserResultTransformerImpl implements ApiUserResultTransformer {

	@Override
	public ApiUserResult transform(ApiUser entity) {
		ApiUserResult result = new ApiUserResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setDisplayName(entity.getDisplayName());
		result.setEmail(entity.getEmail());
		result.setPassword(entity.getPassword());		
		result.setUsername(entity.getUsername());
		
		return result;
	}

}
