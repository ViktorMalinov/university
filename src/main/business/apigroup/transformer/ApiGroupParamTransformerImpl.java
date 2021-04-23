package main.business.apigroup.transformer;

import main.business.apigroup.validator.ApiGroupParamValidator;
import main.business.apigroup.validator.ApiGroupParamValidatorImpl;
import main.dataaccess.apigroup.ApiGroup;
import main.service.apigroup.ApiGroupParam;

public class ApiGroupParamTransformerImpl implements ApiGroupParamTransformer {

	private ApiGroupParamValidator validator = new ApiGroupParamValidatorImpl();
	
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
