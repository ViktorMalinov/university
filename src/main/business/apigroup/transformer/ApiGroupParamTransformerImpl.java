package main.business.apigroup.transformer;

import main.business.apigroup.validator.ApiGroupParamValidatorImpl;
import main.business.common.BaseParamValidatorImpl;
import main.dataaccess.apigroup.dao.ApiGroup;
import main.service.apigroup.ApiGroupParam;

public class ApiGroupParamTransformerImpl implements ApiGroupParamTransformer {

	private BaseParamValidatorImpl <ApiGroupParam> validator = new ApiGroupParamValidatorImpl();
	
	@Override
	public ApiGroup transform(ApiGroupParam param) throws Exception {

		validator.validate(param);
		
		ApiGroup entity = new ApiGroup();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		entity.setDisplayName(param.getDisplayName());
		
		return entity;
	}

}
