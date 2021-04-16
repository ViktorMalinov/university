package main.service.apiuser;

import main.business.apiuser.processor.ApiUserProcessor;
import main.business.apiuser.processor.ApiUserProcessorImpl;

public class ApiUserServiceImpl implements ApiUserService {

	private ApiUserProcessor processor = new ApiUserProcessorImpl();
	
	
	@Override
	public ApiUserResult create(ApiUserParam param) {
		ApiUserResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public ApiUserResult get(Long id) {
		ApiUserResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(ApiUserParam param) {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}
	
}
