package main.business.apigroup.processor;

import java.util.Set;
import main.business.apigroup.transformer.ApiGroupParamTransformer;
import main.business.apigroup.transformer.ApiGroupParamTransformerImpl;
import main.business.apigroup.transformer.ApiGroupResultTransformer;
import main.business.apigroup.transformer.ApiGroupResultTransformerImpl;
import main.dataaccess.apigroup.ApiGroup;
import main.dataaccess.apigroup.ApiGroupDao;
import main.dataaccess.apigroup.ApiGroupDaoHMapImpl;
import main.service.apigroup.ApiGroupParam;
import main.service.apigroup.ApiGroupResult;
import main.common.*;

public class ApiGroupProcessorImpl implements ApiGroupProcessor {

	ApiGroupDao db = new ApiGroupDaoHMapImpl();
	ApiGroupParamTransformer paramTransformer = new ApiGroupParamTransformerImpl(); 
	ApiGroupResultTransformer resultTransformer = new ApiGroupResultTransformerImpl();
	
	
	@Override
	public ApiGroupResult create(ApiGroupParam obj) {
		ApiGroup dbObj = paramTransformer.transform(obj); 
		Set<Long> idSet = db.keySet();
		Long id = getNextId(idSet);
				
		
		dbObj = db.create(dbObj);
		
		ApiGroupResult res = resultTransformer.transform(dbObj);
		return res;
	}

	
	
	@Override
	public ApiGroupResult get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ApiGroupParam obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
