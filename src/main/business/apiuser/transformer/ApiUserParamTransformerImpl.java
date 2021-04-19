package main.business.apiuser.transformer;

import main.dataaccess.apiuser.ApiUser;
import main.service.apiuser.ApiUserParam;

public class ApiUserParamTransformerImpl implements ApiUserParamTransformer {

	@Override
	public ApiUser transform(ApiUserParam obj) {
		ApiUser res = new ApiUser();
		
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
