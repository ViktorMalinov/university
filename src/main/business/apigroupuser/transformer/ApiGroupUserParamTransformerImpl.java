package main.business.apigroupuser.transformer;

import main.business.apigroupuser.validator.ApiGroupUserParamValidator;
import main.business.apigroupuser.validator.ApiGroupUserParamValidatorImpl;
import main.dataaccess.apigroup.dao.ApiGroup;
import main.dataaccess.apigroup.dao.ApiGroupDao;
import main.dataaccess.apigroup.dao.ApiGroupDaoHMapImpl;
import main.dataaccess.apigroupuser.dao.ApiGroupUser;
import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.apiuser.dao.ApiUserDao;
import main.dataaccess.apiuser.dao.ApiUserDaoHMapImpl;
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
