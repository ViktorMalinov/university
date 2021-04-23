package main.business.apiuser.transformer;

import main.dataaccess.apiuser.dao.ApiUser;
import main.service.apiuser.ApiUserResult;

public interface ApiUserResultTransformer {

	ApiUserResult transform(ApiUser entity);
}
