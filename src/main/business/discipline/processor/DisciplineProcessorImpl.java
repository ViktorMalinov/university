package main.business.discipline.processor;

import java.util.Set;

import main.business.discipline.transformer.DisciplineParamTransformer;
import main.business.discipline.transformer.DisciplineParamTransformerImpl;
import main.business.discipline.transformer.DisciplineResultTransformer;
import main.business.discipline.transformer.DisciplineResultTransformerImpl;
import main.common.Utils;
import main.dataaccess.discipline.Discipline;
import main.dataaccess.discipline.DisciplineDao;
import main.dataaccess.discipline.DisciplineDaoHMapImpl;
import main.service.discipline.DisciplineParam;
import main.service.discipline.DisciplineResult;

public class DisciplineProcessorImpl implements DisciplineProcessor {

	DisciplineDao db = new DisciplineDaoHMapImpl();
	DisciplineParamTransformer paramTransformer = new DisciplineParamTransformerImpl(); 
	DisciplineResultTransformer resultTransformer = new DisciplineResultTransformerImpl();
	
	
	@Override
	public DisciplineResult create(DisciplineParam param) {
		Discipline entity = paramTransformer.transform(param); 
		Set<Long> idSet = db.getKeySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		entity = db.create(entity);
		
		DisciplineResult result = resultTransformer.transform(entity);
		return result;
	}
	
	@Override
	public DisciplineResult get(Long id) {
		Discipline entity = db.get(id);
		DisciplineResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(DisciplineParam param) {
		Discipline entity = paramTransformer.transform(param);
		db.update(entity);
	}

	@Override
	public void delete(Long id) {
		db.delete(id);
	}

}
