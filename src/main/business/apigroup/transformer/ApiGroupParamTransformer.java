package main.business.apigroup.transformer;

import main.dataaccess.apigroup.dao.ApiGroup;
import main.service.apigroup.ApiGroupParam;

public interface ApiGroupParamTransformer {

	ApiGroup transform(ApiGroupParam param) throws Exception;
}
