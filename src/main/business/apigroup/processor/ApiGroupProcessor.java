package main.business.apigroup.processor;

import main.service.apigroup.ApiGroupParam;
import main.service.apigroup.ApiGroupResult;

public interface ApiGroupProcessor {

	ApiGroupResult create(ApiGroupParam param) throws Exception;
	ApiGroupResult get(Long id) throws Exception;
	void update(ApiGroupParam param) throws Exception;
	void delete(Long id);

}
