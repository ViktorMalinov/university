package main.business.apigroup.transformer;

import main.dataaccess.apigroup.ApiGroup;
import main.service.apigroup.ApiGroupResult;

public interface ApiGroupResultTransformer {

	ApiGroupResult transform(ApiGroup obj);
}
