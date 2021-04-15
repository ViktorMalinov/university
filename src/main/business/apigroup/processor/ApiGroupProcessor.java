package main.business.apigroup.processor;

import main.service.apigroup.ApiGroupParam;
import main.service.apigroup.ApiGroupResult;

public interface ApiGroupProcessor {

	ApiGroupResult create(ApiGroupParam obj);
	ApiGroupResult get(Long id);
	void update(ApiGroupParam obj);
	void delete(Long id);

}
