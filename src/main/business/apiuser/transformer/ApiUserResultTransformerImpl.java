package main.business.apiuser.transformer;

import main.dataaccess.apiuser.ApiUser;
import main.service.apiuser.ApiUserResult;

public class ApiUserResultTransformerImpl implements ApiUserResultTransformer {

	@Override
	public ApiUserResult transform(ApiUser obj) {
		ApiUserResult res = new ApiUserResult();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setDescription(obj.getDescription());
		res.setDisplayName(obj.getDisplayName());
		res.setEmail(obj.getEmail());
		res.setPassword(obj.getPassword());		
		res.setUsername(obj.getUsername());
		
		return res;
	}

}
