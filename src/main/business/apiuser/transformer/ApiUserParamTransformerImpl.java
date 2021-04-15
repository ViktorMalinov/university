package main.business.apiuser.transformer;

import main.dataaccess.apiuser.ApiUser;
import main.service.apiuser.ApiUserParam;

public class ApiUserParamTransformerImpl implements ApiUserParamTransformer {

	@Override
	public ApiUser transform(ApiUserParam obj) {
		ApiUser res = new ApiUser();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
