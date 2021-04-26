package main.business.department.processor;

import main.business.department.transformer.DepartmentParamTransformer;
import main.business.department.transformer.DepartmentParamTransformerImpl;
import main.business.department.transformer.DepartmentResultTransformer;
import main.business.department.transformer.DepartmentResultTransformerImpl;
import main.dataaccess.department.dao.Department;
import main.dataaccess.department.dao.DepartmentDao;
import main.dataaccess.department.dao.DepartmentDaoHMapImpl;
import main.service.department.DepartmentParam;
import main.service.department.DepartmentResult;

public class DepartmentProcessorImpl implements DepartmentProcessor {

	DepartmentDao dao = new DepartmentDaoHMapImpl();
	DepartmentParamTransformer paramTransformer = new DepartmentParamTransformerImpl(); 
	DepartmentResultTransformer resultTransformer = new DepartmentResultTransformerImpl();

	
	@Override
	public DepartmentResult create(DepartmentParam param) throws Exception {
		Department entity = paramTransformer.transform(param); 
		
		entity = dao.create(entity);
		
		DepartmentResult result = resultTransformer.transform(entity);
		return result;	
	}

	@Override
	public DepartmentResult get(Long id) throws Exception {
		Department entity = dao.get(id);
		DepartmentResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(DepartmentParam param) throws Exception {
		Department entity = paramTransformer.transform(param);
		dao.update(entity);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

}
