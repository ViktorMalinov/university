package main.business.apigroupuser.processor;

import java.util.Set;

import main.business.apigroupuser.transformer.ApiGroupUserParamTransformer;
import main.business.apigroupuser.transformer.ApiGroupUserParamTransformerImpl;
import main.business.apigroupuser.transformer.ApiGroupUserResultTransformer;
import main.business.apigroupuser.transformer.ApiGroupUserResultTransformerImpl;
import main.common.Utils;
import main.dataaccess.apigroupuser.ApiGroupUser;
import main.dataaccess.apigroupuser.ApiGroupUserDao;
import main.dataaccess.apigroupuser.ApiGroupUserDaoHMapImpl;
import main.service.apigroupuser.ApiGroupUserParam;
import main.service.apigroupuser.ApiGroupUserResult;

public class ApiGroupUserProcessorImpl implements ApiGroupUserProcessor {

	ApiGroupUserDao db = new ApiGroupUserDaoHMapImpl();
	ApiGroupUserParamTransformer paramTransformer = new ApiGroupUserParamTransformerImpl(); 
	ApiGroupUserResultTransformer resultTransformer = new ApiGroupUserResultTransformerImpl();
	
	
	@Override
	public ApiGroupUserResult create(ApiGroupUserParam param) {
		ApiGroupUser entity = paramTransformer.transform(param); 
		Set<Long> idSet = db.getKeySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		entity = db.create(entity);
		
		ApiGroupUserResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public ApiGroupUserResult get(Long id) {
		ApiGroupUser entity = db.get(id);
		ApiGroupUserResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(ApiGroupUserParam param) {
		ApiGroupUser entity = paramTransformer.transform(param);
		db.update(entity);
	}

	@Override
	public void delete(Long id) {
		db.delete(id);
	}

}
