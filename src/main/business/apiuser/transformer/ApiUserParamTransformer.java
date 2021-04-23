package main.business.apiuser.transformer;

import main.dataaccess.apiuser.dao.ApiUser;
import main.service.apiuser.ApiUserParam;

public interface ApiUserParamTransformer {
	
	ApiUser transform(ApiUserParam param) throws Exception;

}
