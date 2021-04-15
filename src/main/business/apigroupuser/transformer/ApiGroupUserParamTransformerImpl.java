package main.business.apigroupuser.transformer;

import main.dataaccess.apigroupuser.ApiGroupUser;
import main.service.apigroupuser.ApiGroupUserParam;

public class ApiGroupUserParamTransformerImpl implements ApiGroupUserParamTransformer {

	@Override
	public ApiGroupUser transform(ApiGroupUserParam obj) {
		ApiGroupUser res = new ApiGroupUser();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
