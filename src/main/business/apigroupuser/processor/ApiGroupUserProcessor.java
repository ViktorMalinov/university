package main.business.apigroupuser.processor;

import main.service.apigroupuser.ApiGroupUserParam;
import main.service.apigroupuser.ApiGroupUserResult;

public interface ApiGroupUserProcessor {

	ApiGroupUserResult create(ApiGroupUserParam param);
	ApiGroupUserResult get(Long id);
	void update(ApiGroupUserParam param);
	void delete(Long id);
}
