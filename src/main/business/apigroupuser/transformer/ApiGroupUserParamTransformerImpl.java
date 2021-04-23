package main.business.apigroupuser.transformer;

import main.business.apigroupuser.validator.ApiGroupUserParamValidator;
import main.business.apigroupuser.validator.ApiGroupUserParamValidatorImpl;
import main.dataaccess.apigroup.ApiGroup;
import main.dataaccess.apigroup.ApiGroupDao;
import main.dataaccess.apigroup.ApiGroupDaoHMapImpl;
import main.dataaccess.apigroupuser.ApiGroupUser;
import main.dataaccess.apiuser.ApiUser;
import main.dataaccess.apiuser.ApiUserDao;
import main.dataaccess.apiuser.ApiUserDaoHMapImpl;
import main.service.apigroupuser.ApiGroupUserParam;

public class ApiGroupUserParamTransformerImpl implements ApiGroupUserParamTransformer {

	private ApiGroupDao	apiGroupDao = new ApiGroupDaoHMapImpl();
	private ApiUserDao apiUserDao = new ApiUserDaoHMapImpl();
	private ApiGroupUserParamValidator validator = new ApiGroupUserParamValidatorImpl();
	
	@Override
	public ApiGroupUser transform(ApiGroupUserParam param) throws Exception {
		validator.validate(param);
		
		ApiGroupUser entity = new ApiGroupUser();
		ApiGroup apiGroup = apiGroupDao.get(param.getApiGroupId());
		ApiUser apiUser = apiUserDao.get(param.getApiUserId());
		
		entity.setId(param.getId());
		entity.setApiGroup(apiGroup);
		entity.setApiUser(apiUser);
		
		return entity;
	}

}
