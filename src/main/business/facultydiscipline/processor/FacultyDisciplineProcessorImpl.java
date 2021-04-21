package main.business.facultydiscipline.processor;

import java.util.Set;

import main.business.facultydiscipline.transformer.FacultyDisciplineParamTransformer;
import main.business.facultydiscipline.transformer.FacultyDisciplineParamTransformerImpl;
import main.business.facultydiscipline.transformer.FacultyDisciplineResultTransformer;
import main.business.facultydiscipline.transformer.FacultyDisciplineResultTransformerImpl;
import main.common.Utils;
import main.dataaccess.facultydiscipline.FacultyDiscipline;
import main.dataaccess.facultydiscipline.FacultyDisciplineDao;
import main.dataaccess.facultydiscipline.FacultyDisciplineDaoHMapImpl;
import main.service.facultydiscipline.FacultyDisciplineParam;
import main.service.facultydiscipline.FacultyDisciplineResult;

public class FacultyDisciplineProcessorImpl implements FacultyDisciplineProcessor {

	FacultyDisciplineDao dao = new FacultyDisciplineDaoHMapImpl();
	FacultyDisciplineParamTransformer paramTransformer = new FacultyDisciplineParamTransformerImpl(); 
	FacultyDisciplineResultTransformer resultTransformer = new FacultyDisciplineResultTransformerImpl();
	
	
	@Override
	public FacultyDisciplineResult create(FacultyDisciplineParam param) throws Exception {
		FacultyDiscipline entity = paramTransformer.transform(param); 
		Set<Long> idSet = dao.getKeySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		entity = dao.create(entity);
		
		FacultyDisciplineResult result = resultTransformer.transform(entity);
		return result;
	}
	
	@Override
	public FacultyDisciplineResult get(Long id) throws Exception {
		FacultyDiscipline entity = dao.get(id);
		FacultyDisciplineResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(FacultyDisciplineParam param) throws Exception {
		FacultyDiscipline entity = paramTransformer.transform(param);
		dao.update(entity);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

}
