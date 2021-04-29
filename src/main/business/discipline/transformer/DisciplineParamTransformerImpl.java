package main.business.discipline.transformer;

import main.business.discipline.validator.DisciplineParamValidator;
import main.business.discipline.validator.DisciplineParamValidatorImpl;
import main.dataaccess.discipline.dao.Discipline;
import main.service.discipline.DisciplineParam;

public class DisciplineParamTransformerImpl implements DisciplineParamTransformer {

	private DisciplineParamValidator validator = new DisciplineParamValidatorImpl();
	
	@Override
	public Discipline transform(DisciplineParam param) throws Exception {
		
		validator.validate(param);
				
		Discipline entity = new Discipline();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		return entity;
	}

}
