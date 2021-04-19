package main.business.apigroup.transformer;

import main.dataaccess.apigroup.ApiGroup;
import main.service.apigroup.ApiGroupResult;

public class ApiGroupResultTransformerImpl implements ApiGroupResultTransformer {

	@Override
	public ApiGroupResult transform(ApiGroup obj) {
		ApiGroupResult res = new ApiGroupResult();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		res.setDisplayName(obj.getDisplayName());
		
		return res;
	}

}
