package main.business.apigroup.processor;

import main.service.apigroup.ApiGroupParam;
import main.service.apigroup.ApiGroupResult;

public interface ApiGroupProcessor {

	ApiGroupResult create(ApiGroupParam param);
	ApiGroupResult get(Long id);
	void update(ApiGroupParam param);
	void delete(Long id);

}
