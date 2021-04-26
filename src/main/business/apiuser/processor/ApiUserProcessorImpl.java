package main.business.apiuser.processor;

import main.business.apiuser.transformer.ApiUserParamTransformer;
import main.business.apiuser.transformer.ApiUserParamTransformerImpl;
import main.business.apiuser.transformer.ApiUserResultTransformer;
import main.business.apiuser.transformer.ApiUserResultTransformerImpl;
import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.apiuser.dao.ApiUserDao;
import main.dataaccess.apiuser.dao.ApiUserDaoHMapImpl;
import main.service.apiuser.ApiUserParam;
import main.service.apiuser.ApiUserResult;

public class ApiUserProcessorImpl implements ApiUserProcessor {

	ApiUserDao dao = new ApiUserDaoHMapImpl();
	ApiUserParamTransformer paramTransformer = new ApiUserParamTransformerImpl(); 
	ApiUserResultTransformer resultTransformer = new ApiUserResultTransformerImpl();
	
	@Override
	public ApiUserResult create(ApiUserParam param) throws Exception {
		ApiUser entity = paramTransformer.transform(param); 
		
		entity = dao.create(entity);
		
		ApiUserResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public ApiUserResult get(Long id) throws Exception {
		ApiUser entity = dao.get(id);
		ApiUserResult result = resultTransformer.transform(entity);
		return result;	}

	@Override
	public void update(ApiUserParam param) throws Exception {
		ApiUser entity = paramTransformer.transform(param);
		dao.update(entity);	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

}
