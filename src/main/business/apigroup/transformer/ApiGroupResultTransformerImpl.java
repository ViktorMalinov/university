package main.business.apigroup.transformer;

import main.dataaccess.apigroup.dao.ApiGroup;
import main.service.apigroup.ApiGroupResult;

public class ApiGroupResultTransformerImpl implements ApiGroupResultTransformer {

	@Override
	public ApiGroupResult transform(ApiGroup entity) {
		ApiGroupResult result = new ApiGroupResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		result.setDisplayName(entity.getDisplayName());
		
		return result;
	}

}
