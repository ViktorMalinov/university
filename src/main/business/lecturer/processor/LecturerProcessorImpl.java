package main.business.lecturer.processor;

import java.util.Set;

import main.business.lecturer.transformer.LecturerParamTransformer;
import main.business.lecturer.transformer.LecturerParamTransformerImpl;
import main.business.lecturer.transformer.LecturerResultTransformer;
import main.business.lecturer.transformer.LecturerResultTransformerImpl;
import main.common.Utils;
import main.dataaccess.lecturer.Lecturer;
import main.dataaccess.lecturer.LecturerDao;
import main.dataaccess.lecturer.LecturerDaoHMapImpl;
import main.service.lecturer.LecturerParam;
import main.service.lecturer.LecturerResult;

public class LecturerProcessorImpl implements LecturerProcessor {

	LecturerDao db = new LecturerDaoHMapImpl();
	LecturerParamTransformer paramTransformer = new LecturerParamTransformerImpl(); 
	LecturerResultTransformer resultTransformer = new LecturerResultTransformerImpl();
	
	
	@Override
	public LecturerResult create(LecturerParam param) {
		Lecturer entity = paramTransformer.transform(param); 
		Set<Long> idSet = db.getKeySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		entity = db.create(entity);
		
		LecturerResult result = resultTransformer.transform(entity);
		return result;
	}
	
	@Override
	public LecturerResult get(Long id) {
		Lecturer entity = db.get(id);
		LecturerResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(LecturerParam param) {
		Lecturer entity = paramTransformer.transform(param);
		db.update(entity);
	}

	@Override
	public void delete(Long id) {
		db.delete(id);
	}

}
