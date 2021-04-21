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

	ApiGroupUserDao dao = new ApiGroupUserDaoHMapImpl();
	ApiGroupUserParamTransformer paramTransformer = new ApiGroupUserParamTransformerImpl(); 
	ApiGroupUserResultTransformer resultTransformer = new ApiGroupUserResultTransformerImpl();
	
	
	@Override
	public ApiGroupUserResult create(ApiGroupUserParam param) throws Exception {
		ApiGroupUser entity = paramTransformer.transform(param); 
		Set<Long> idSet = dao.getKeySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		entity = dao.create(entity);
		
		ApiGroupUserResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public ApiGroupUserResult get(Long id) throws Exception {
		ApiGroupUser entity = dao.get(id);
		ApiGroupUserResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(ApiGroupUserParam param) throws Exception {
		ApiGroupUser entity = paramTransformer.transform(param);
		dao.update(entity);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

}
