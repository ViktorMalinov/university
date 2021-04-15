package main.business.apigroup.transformer;

import main.dataaccess.apigroup.ApiGroup;
import main.service.apigroup.ApiGroupParam;

public class ApiGroupParamTransformerImpl implements ApiGroupParamTransformer {

	@Override
	public ApiGroup transform(ApiGroupParam obj) {
		ApiGroup res = new ApiGroup();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
