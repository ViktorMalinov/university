package main.business.discipline.processor;

import main.business.discipline.transformer.DisciplineParamTransformer;
import main.business.discipline.transformer.DisciplineParamTransformerImpl;
import main.business.discipline.transformer.DisciplineResultTransformer;
import main.business.discipline.transformer.DisciplineResultTransformerImpl;
import main.dataaccess.discipline.dao.Discipline;
import main.dataaccess.discipline.dao.DisciplineDao;
import main.dataaccess.discipline.dao.DisciplineDaoHMapImpl;
import main.service.discipline.DisciplineParam;
import main.service.discipline.DisciplineResult;

public class DisciplineProcessorImpl implements DisciplineProcessor {

	DisciplineDao dao = new DisciplineDaoHMapImpl();
	DisciplineParamTransformer paramTransformer = new DisciplineParamTransformerImpl(); 
	DisciplineResultTransformer resultTransformer = new DisciplineResultTransformerImpl();
	
	
	@Override
	public DisciplineResult create(DisciplineParam param) throws Exception {
		Discipline entity = paramTransformer.transform(param); 
		
		entity = dao.create(entity);
		
		DisciplineResult result = resultTransformer.transform(entity);
		return result;
	}
	
	@Override
	public DisciplineResult get(Long id)  throws Exception{
		Discipline entity = dao.get(id);
		DisciplineResult result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(DisciplineParam param)  throws Exception{
		Discipline entity = paramTransformer.transform(param);
		dao.update(entity);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

}
