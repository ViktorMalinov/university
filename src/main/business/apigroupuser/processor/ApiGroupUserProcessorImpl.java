package main.business.apigroupuser.processor;

import main.business.apigroupuser.transformer.ApiGroupUserParamTransformer;
import main.business.apigroupuser.transformer.ApiGroupUserParamTransformerImpl;
import main.business.apigroupuser.transformer.ApiGroupUserResultTransformer;
import main.business.apigroupuser.transformer.ApiGroupUserResultTransformerImpl;
import main.dataaccess.apigroupuser.dao.ApiGroupUser;
import main.dataaccess.apigroupuser.dao.ApiGroupUserDao;
import main.dataaccess.apigroupuser.dao.ApiGroupUserDaoHMapImpl;
import main.service.apigroupuser.ApiGroupUserParam;
import main.service.apigroupuser.ApiGroupUserResult;

public class ApiGroupUserProcessorImpl implements ApiGroupUserProcessor {

	ApiGroupUserDao dao = new ApiGroupUserDaoHMapImpl();
	ApiGroupUserParamTransformer paramTransformer = new ApiGroupUserParamTransformerImpl(); 
	ApiGroupUserResultTransformer resultTransformer = new ApiGroupUserResultTransformerImpl();
	
	
	@Override
	public ApiGroupUserResult create(ApiGroupUserParam param) throws Exception {
		ApiGroupUser entity = paramTransformer.transform(param); 
		
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
