package main.business.apigroup.transformer;

import main.dataaccess.apigroup.ApiGroup;
import main.service.apigroup.ApiGroupParam;

public interface ApiGroupParamTransformer {

	ApiGroup transform(ApiGroupParam obj);
}
