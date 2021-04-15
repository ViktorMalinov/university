package main.business.apiuser.transformer;

import main.dataaccess.apiuser.ApiUser;
import main.service.apiuser.ApiUserResult;

public interface ApiUserResultTransformer {

	ApiUserResult transform(ApiUser obj);
}
