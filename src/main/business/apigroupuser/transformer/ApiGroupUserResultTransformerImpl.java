package main.business.apigroupuser.transformer;

import main.dataaccess.apigroupuser.ApiGroupUser;
import main.service.apigroupuser.ApiGroupUserResult;

public class ApiGroupUserResultTransformerImpl implements ApiGroupUserResultTransformer {

	@Override
	public ApiGroupUserResult transform(ApiGroupUser obj) {
		ApiGroupUserResult res = new ApiGroupUserResult();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
