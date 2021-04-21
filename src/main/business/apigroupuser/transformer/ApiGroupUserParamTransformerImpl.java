package main.business.apigroupuser.transformer;

import main.dataaccess.apigroup.ApiGroup;
import main.dataaccess.apigroup.ApiGroupDao;
import main.dataaccess.apigroup.ApiGroupDaoHMapImpl;
import main.dataaccess.apigroupuser.ApiGroupUser;
import main.dataaccess.apiuser.ApiUser;
import main.dataaccess.apiuser.ApiUserDao;
import main.dataaccess.apiuser.ApiUserDaoHMapImpl;
import main.service.apigroupuser.ApiGroupUserParam;

public class ApiGroupUserParamTransformerImpl implements ApiGroupUserParamTransformer {

	ApiGroupDao	apiGroupDao = new ApiGroupDaoHMapImpl();
	ApiUserDao apiUserDao = new ApiUserDaoHMapImpl();
	
	@Override
	public ApiGroupUser transform(ApiGroupUserParam param) throws Exception {
		ApiGroupUser entity = new ApiGroupUser();
		
		entity.setId(param.getId());
		
		if (param.getApiGroupId() == null) {
			throw new Exception("The API Group ID was NOT found!");
		}		

		if (param.getApiUserId() == null) {
			throw new Exception("The API User ID was NOT found!");
		}		
		
		ApiGroup apiGroup = apiGroupDao.get(param.getApiGroupId());
		ApiUser apiUser = apiUserDao.get(param.getApiUserId());
		
		if (apiGroup == null) {
			throw new Exception("The API Group DAO was NOT found!");
		}
		
		if (apiUser == null) {
			throw new Exception("The API User DAO was NOT found!");
		}

		
		entity.setApiGroup(apiGroup);
		entity.setApiUser(apiUser);
		
		return entity;
	}

}
