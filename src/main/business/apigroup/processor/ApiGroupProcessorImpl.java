package main.business.apigroup.processor;

import main.business.apigroup.transformer.ApiGroupParamTransformer;
import main.business.apigroup.transformer.ApiGroupParamTransformerImpl;
import main.business.apigroup.transformer.ApiGroupResultTransformer;
import main.business.apigroup.transformer.ApiGroupResultTransformerImpl;
import main.dataaccess.apigroup.dao.ApiGroup;
import main.dataaccess.apigroup.dao.ApiGroupDao;
import main.dataaccess.apigroup.dao.ApiGroupDaoHMapImpl;
import main.service.apigroup.ApiGroupParam;
import main.service.apigroup.ApiGroupResult;


public class ApiGroupProcessorImpl implements ApiGroupProcessor {

	ApiGroupDao dao = new ApiGroupDaoHMapImpl();
	ApiGroupParamTransformer paramTransformer = new ApiGroupParamTransformerImpl(); 
	ApiGroupResultTransformer resultTransformer = new ApiGroupResultTransformerImpl();
	
	
	@Override
	public ApiGroupResult create(ApiGroupParam param) throws Exception {
		ApiGroup entity = paramTransformer.transform(param); 
		
		entity = dao.create(entity);
		
		ApiGroupResult result = resultTransformer.transform(entity);
		return result;
	}
	
	@Override
	public ApiGroupResult get(Long id) throws Exception {
		ApiGroup entity = dao.get(id);
		ApiGroupResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(ApiGroupParam param) throws Exception {
		ApiGroup entity = paramTransformer.transform(param);
		dao.update(entity);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

}
