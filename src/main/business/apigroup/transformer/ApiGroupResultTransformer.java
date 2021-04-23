package main.business.apigroup.transformer;

import main.dataaccess.apigroup.dao.ApiGroup;
import main.service.apigroup.ApiGroupResult;

public interface ApiGroupResultTransformer {

	ApiGroupResult transform(ApiGroup entity);
}
