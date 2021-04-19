package main.business.speciality.processor;

import java.util.Set;

import main.business.speciality.transformer.SpecialityParamTransformer;
import main.business.speciality.transformer.SpecialityParamTransformerImpl;
import main.business.speciality.transformer.SpecialityResultTransformer;
import main.business.speciality.transformer.SpecialityResultTransformerImpl;
import main.common.Utils;
import main.dataaccess.speciality.Speciality;
import main.dataaccess.speciality.SpecialityDao;
import main.dataaccess.speciality.SpecialityDaoHMapImpl;
import main.service.speciality.SpecialityParam;
import main.service.speciality.SpecialityResult;

public class SpecialityProcessorImpl implements SpecialityProcessor {

	SpecialityDao db = new SpecialityDaoHMapImpl();
	SpecialityParamTransformer paramTransformer = new SpecialityParamTransformerImpl(); 
	SpecialityResultTransformer resultTransformer = new SpecialityResultTransformerImpl();
	
	
	@Override
	public SpecialityResult create(SpecialityParam param) {
		Speciality entity = paramTransformer.transform(param); 
		Set<Long> idSet = db.getKeySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		entity = db.create(entity);
		
		SpecialityResult result = resultTransformer.transform(entity);
		return result;
	}
	
	@Override
	public SpecialityResult get(Long id) {
		Speciality entity = db.get(id);
		SpecialityResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(SpecialityParam param) {
		Speciality entity = paramTransformer.transform(param);
		db.update(entity);
	}

	@Override
	public void delete(Long id) {
		db.delete(id);
	}

}