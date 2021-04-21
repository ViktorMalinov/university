package main.business.apigroupuser.processor;

import main.service.apigroupuser.ApiGroupUserParam;
import main.service.apigroupuser.ApiGroupUserResult;

public interface ApiGroupUserProcessor {

	ApiGroupUserResult create(ApiGroupUserParam param) throws Exception;
	ApiGroupUserResult get(Long id) throws Exception;
	void update(ApiGroupUserParam param) throws Exception;
	void delete(Long id);
}
