package main.business.department.processor;

import java.util.Set;

import main.business.department.transformer.DepartmentParamTransformer;
import main.business.department.transformer.DepartmentParamTransformerImpl;
import main.business.department.transformer.DepartmentResultTransformer;
import main.business.department.transformer.DepartmentResultTransformerImpl;
import main.common.Utils;
import main.dataaccess.department.Department;
import main.dataaccess.department.DepartmentDao;
import main.dataaccess.department.DepartmentDaoHMapImpl;
import main.service.department.DepartmentParam;
import main.service.department.DepartmentResult;

public class DepartmentProcessorImpl implements DepartmentProcessor {

	DepartmentDao db = new DepartmentDaoHMapImpl();
	DepartmentParamTransformer paramTransformer = new DepartmentParamTransformerImpl(); 
	DepartmentResultTransformer resultTransformer = new DepartmentResultTransformerImpl();

	
	@Override
	public DepartmentResult create(DepartmentParam param) {
		Department entity = paramTransformer.transform(param); 
		Set<Long> idSet = db.getKeySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		entity = db.create(entity);
		
		DepartmentResult result = resultTransformer.transform(entity);
		return result;	
	}

	@Override
	public DepartmentResult get(Long id) {
		Department entity = db.get(id);
		DepartmentResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(DepartmentParam param) {
		Department entity = paramTransformer.transform(param);
		db.update(entity);
	}

	@Override
	public void delete(Long id) {
		db.delete(id);
	}

}
