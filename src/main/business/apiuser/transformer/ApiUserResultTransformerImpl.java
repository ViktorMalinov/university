package main.business.apiuser.transformer;

import main.dataaccess.apiuser.ApiUser;
import main.service.apiuser.ApiUserResult;

public class ApiUserResultTransformerImpl implements ApiUserResultTransformer {

	@Override
	public ApiUserResult transform(ApiUser obj) {
		ApiUserResult res = new ApiUserResult();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
