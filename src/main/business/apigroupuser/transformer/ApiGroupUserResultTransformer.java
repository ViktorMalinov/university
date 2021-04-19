package main.business.apigroupuser.transformer;

import main.dataaccess.apigroupuser.ApiGroupUser;
import main.service.apigroupuser.ApiGroupUserResult;

public interface ApiGroupUserResultTransformer {

	ApiGroupUserResult transform(ApiGroupUser entity);
}
