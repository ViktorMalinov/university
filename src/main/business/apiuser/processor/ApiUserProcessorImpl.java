package main.business.apiuser.processor;

import java.util.Set;

import main.business.apiuser.transformer.ApiUserParamTransformer;
import main.business.apiuser.transformer.ApiUserParamTransformerImpl;
import main.business.apiuser.transformer.ApiUserResultTransformer;
import main.business.apiuser.transformer.ApiUserResultTransformerImpl;
import main.common.Utils;
import main.dataaccess.apiuser.ApiUser;
import main.dataaccess.apiuser.ApiUserDao;
import main.dataaccess.apiuser.ApiUserDaoHMapImpl;
import main.service.apiuser.ApiUserParam;
import main.service.apiuser.ApiUserResult;

public class ApiUserProcessorImpl implements ApiUserProcessor {

	ApiUserDao db = new ApiUserDaoHMapImpl();
	ApiUserParamTransformer paramTransformer = new ApiUserParamTransformerImpl(); 
	ApiUserResultTransformer resultTransformer = new ApiUserResultTransformerImpl();
	
	@Override
	public ApiUserResult create(ApiUserParam param) {
		ApiUser entity = paramTransformer.transform(param); 
		Set<Long> idSet = db.getKeySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		entity = db.create(entity);
		
		ApiUserResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public ApiUserResult get(Long id) {
		ApiUser entity = db.get(id);
		ApiUserResult result = resultTransformer.transform(entity);
		return result;	}

	@Override
	public void update(ApiUserParam param) {
		ApiUser entity = paramTransformer.transform(param);
		db.update(entity);	}

	@Override
	public void delete(Long id) {
		db.delete(id);
	}

}
