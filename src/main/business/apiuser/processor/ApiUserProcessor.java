package main.business.apiuser.processor;

import main.service.apiuser.ApiUserParam;
import main.service.apiuser.ApiUserResult;

public interface ApiUserProcessor {

	ApiUserResult create(ApiUserParam param) throws Exception;
	ApiUserResult get(Long id) throws Exception;
	void update(ApiUserParam param) throws Exception;
	void delete(Long id);

}
