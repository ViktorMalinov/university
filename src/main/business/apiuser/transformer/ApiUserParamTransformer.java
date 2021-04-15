package main.business.apiuser.transformer;

import main.dataaccess.apiuser.ApiUser;
import main.service.apiuser.ApiUserParam;

public interface ApiUserParamTransformer {
	
	ApiUser transform(ApiUserParam obj);

}
