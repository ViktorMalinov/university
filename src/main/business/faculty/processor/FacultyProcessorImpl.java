package main.business.faculty.processor;

import main.business.faculty.transformer.FacultyParamTransformer;
import main.business.faculty.transformer.FacultyParamTransformerImpl;
import main.business.faculty.transformer.FacultyResultTransformer;
import main.business.faculty.transformer.FacultyResultTransformerImpl;
import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.service.faculty.FacultyParam;
import main.service.faculty.FacultyResult;

public class FacultyProcessorImpl implements FacultyProcessor {

	FacultyDao dao = new FacultyDaoHMapImpl();
	FacultyParamTransformer paramTransformer = new FacultyParamTransformerImpl(); 
	FacultyResultTransformer resultTransformer = new FacultyResultTransformerImpl();
	
	
	@Override
	public FacultyResult create(FacultyParam param) throws Exception {
		Faculty entity = paramTransformer.transform(param); 

		entity = dao.create(entity);
		
		FacultyResult result = resultTransformer.transform(entity);
		return result;
	}
	
	@Override
	public FacultyResult get(Long id) throws Exception {
		Faculty entity = dao.get(id);
		FacultyResult result = resultTransformer.transform(entity);
		return result;
	}
	
	@Override
	public void update(FacultyParam param) throws Exception {
		Faculty entity = paramTransformer.transform(param);
		dao.update(entity);
	}
	
	@Override
	public void delete(Long id) {
		dao.delete(id);
	}


}
