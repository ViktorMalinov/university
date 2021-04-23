package main.service.apigroup;

import main.business.apigroup.processor.ApiGroupProcessor;
import main.business.apigroup.processor.ApiGroupProcessorImpl;

public class ApiGroupServiceImpl implements ApiGroupService {

	private ApiGroupProcessor processor = new ApiGroupProcessorImpl();
	
	
	@Override
	public ApiGroupResult create(ApiGroupParam param) throws Exception {
		ApiGroupResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public ApiGroupResult get(Long id) throws Exception {
		ApiGroupResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(ApiGroupParam param) throws Exception {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}
	
	
}
