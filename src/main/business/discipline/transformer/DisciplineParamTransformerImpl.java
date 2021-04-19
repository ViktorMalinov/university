package main.business.discipline.transformer;

import main.dataaccess.discipline.Discipline;
import main.service.discipline.DisciplineParam;

public class DisciplineParamTransformerImpl implements DisciplineParamTransformer {

	@Override
	public Discipline transform(DisciplineParam param) {
		Discipline entity = new Discipline();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		return entity;
	}

}
