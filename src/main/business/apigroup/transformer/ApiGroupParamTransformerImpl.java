package main.business.apigroup.transformer;

import main.dataaccess.apigroup.ApiGroup;
import main.service.apigroup.ApiGroupParam;

public class ApiGroupParamTransformerImpl implements ApiGroupParamTransformer {

	@Override
	public ApiGroup transform(ApiGroupParam param) {
		ApiGroup entity = new ApiGroup();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		entity.setDisplayName(param.getDisplayName());
		
		return entity;
	}

}
