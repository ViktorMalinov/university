package main.business.lecturer.processor;

import main.business.lecturer.transformer.LecturerParamTransformer;
import main.business.lecturer.transformer.LecturerParamTransformerImpl;
import main.business.lecturer.transformer.LecturerResultTransformer;
import main.business.lecturer.transformer.LecturerResultTransformerImpl;
import main.dataaccess.lecturer.dao.Lecturer;
import main.dataaccess.lecturer.dao.LecturerDao;
import main.dataaccess.lecturer.dao.LecturerDaoHMapImpl;
import main.service.lecturer.LecturerParam;
import main.service.lecturer.LecturerResult;

public class LecturerProcessorImpl implements LecturerProcessor {

	LecturerDao dao = new LecturerDaoHMapImpl();
	LecturerParamTransformer paramTransformer = new LecturerParamTransformerImpl(); 
	LecturerResultTransformer resultTransformer = new LecturerResultTransformerImpl();
	
	
	@Override
	public LecturerResult create(LecturerParam param) throws Exception {
		Lecturer entity = paramTransformer.transform(param); 
		
		entity = dao.create(entity);
		
		LecturerResult result = resultTransformer.transform(entity);
		return result;
	}
	
	@Override
	public LecturerResult get(Long id) throws Exception{
		Lecturer entity = dao.get(id);
		LecturerResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(LecturerParam param) throws Exception {
		Lecturer entity = paramTransformer.transform(param);
		dao.update(entity);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

}
