package main.business.apigroupuser.transformer;

import main.dataaccess.apigroupuser.dao.ApiGroupUser;
import main.service.apigroupuser.ApiGroupUserParam;

public interface ApiGroupUserParamTransformer {

	ApiGroupUser transform(ApiGroupUserParam param) throws Exception;
}
