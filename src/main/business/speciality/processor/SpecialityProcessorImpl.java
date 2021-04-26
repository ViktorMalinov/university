package main.business.speciality.processor;

import main.business.speciality.transformer.SpecialityParamTransformer;
import main.business.speciality.transformer.SpecialityParamTransformerImpl;
import main.business.speciality.transformer.SpecialityResultTransformer;
import main.business.speciality.transformer.SpecialityResultTransformerImpl;
import main.dataaccess.speciality.dao.Speciality;
import main.dataaccess.speciality.dao.SpecialityDao;
import main.dataaccess.speciality.dao.SpecialityDaoHMapImpl;
import main.service.speciality.SpecialityParam;
import main.service.speciality.SpecialityResult;

public class SpecialityProcessorImpl implements SpecialityProcessor {

	SpecialityDao dao = new SpecialityDaoHMapImpl();
	SpecialityParamTransformer paramTransformer = new SpecialityParamTransformerImpl(); 
	SpecialityResultTransformer resultTransformer = new SpecialityResultTransformerImpl();
	
	
	@Override
	public SpecialityResult create(SpecialityParam param) throws Exception {
		Speciality entity = paramTransformer.transform(param); 

		entity = dao.create(entity);
		
		SpecialityResult result = resultTransformer.transform(entity);
		return result;
	}
	
	@Override
	public SpecialityResult get(Long id) throws Exception {
		Speciality entity = dao.get(id);
		SpecialityResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(SpecialityParam param) throws Exception {
		Speciality entity = paramTransformer.transform(param);
		dao.update(entity);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

}
