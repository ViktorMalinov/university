package main.service.apigroupuser;

import main.business.apigroupuser.processor.ApiGroupUserProcessor;
import main.business.apigroupuser.processor.ApiGroupUserProcessorImpl;

public class ApiGroupUserServiceImpl implements ApiGroupUserService {

	private ApiGroupUserProcessor processor = new ApiGroupUserProcessorImpl();
	
	
	@Override
	public ApiGroupUserResult create(ApiGroupUserParam param) throws Exception {
		ApiGroupUserResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public ApiGroupUserResult get(Long id) throws Exception {
		ApiGroupUserResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(ApiGroupUserParam param) throws Exception {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}
	
}
