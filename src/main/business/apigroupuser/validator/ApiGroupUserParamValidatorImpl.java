package main.business.apigroupuser.validator;

import main.dataaccess.apigroup.dao.ApiGroup;
import main.dataaccess.apigroup.dao.ApiGroupDao;
import main.dataaccess.apigroup.dao.ApiGroupDaoHMapImpl;
import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.apiuser.dao.ApiUserDao;
import main.dataaccess.apiuser.dao.ApiUserDaoHMapImpl;
import main.service.apigroupuser.ApiGroupUserParam;

public class ApiGroupUserParamValidatorImpl implements ApiGroupUserParamValidator {

	ApiGroupDao	apiGroupDao = new ApiGroupDaoHMapImpl();
	ApiUserDao apiUserDao = new ApiUserDaoHMapImpl();
	
	@Override
	public void validate(ApiGroupUserParam param) throws Exception {
		
		if (param == null) {
			throw new Exception( "ApiGroupUser param object you want to manipulate was not found!" );
		}
		
		if (param.getApiGroupId() == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}		

		if (param.getApiUserId() == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}		

		ApiGroup apiGroup = apiGroupDao.get(param.getApiGroupId());
		ApiUser apiUser = apiUserDao.get(param.getApiUserId());

		
		if (apiGroup == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}
		
		if (apiUser == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}
		

	}

}
