package main.business.apigroupuser.transformer;

import main.dataaccess.apigroupuser.ApiGroupUser;
import main.service.apigroupuser.ApiGroupUserParam;

public interface ApiGroupUserParamTransformer {

	ApiGroupUser transform(ApiGroupUserParam obj);
}
