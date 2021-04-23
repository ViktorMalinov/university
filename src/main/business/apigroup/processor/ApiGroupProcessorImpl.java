package main.business.apigroup.processor;

import java.util.Set;
import main.business.apigroup.transformer.ApiGroupParamTransformer;
import main.business.apigroup.transformer.ApiGroupParamTransformerImpl;
import main.business.apigroup.transformer.ApiGroupResultTransformer;
import main.business.apigroup.transformer.ApiGroupResultTransformerImpl;
import main.common.Utils;
import main.dataaccess.apigroup.ApiGroup;
import main.dataaccess.apigroup.ApiGroupDao;
import main.dataaccess.apigroup.ApiGroupDaoHMapImpl;
import main.service.apigroup.ApiGroupParam;
import main.service.apigroup.ApiGroupResult;


public class ApiGroupProcessorImpl implements ApiGroupProcessor {

	ApiGroupDao dao = new ApiGroupDaoHMapImpl();
	ApiGroupParamTransformer paramTransformer = new ApiGroupParamTransformerImpl(); 
	ApiGroupResultTransformer resultTransformer = new ApiGroupResultTransformerImpl();
	
	
	@Override
	public ApiGroupResult create(ApiGroupParam param) throws Exception {
		ApiGroup entity = paramTransformer.transform(param); 
		Set<Long> idSet = dao.getKeySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
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
