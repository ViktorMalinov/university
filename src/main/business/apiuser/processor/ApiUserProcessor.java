package main.business.apiuser.processor;

import main.service.apiuser.ApiUserParam;
import main.service.apiuser.ApiUserResult;

public interface ApiUserProcessor {

	ApiUserResult create(ApiUserParam param);
	ApiUserResult get(Long id);
	void update(ApiUserParam param);
	void delete(Long id);

}
