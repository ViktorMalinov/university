package main.business.discipline.transformer;

import main.dataaccess.discipline.dao.Discipline;
import main.service.discipline.DisciplineResult;

public class DisciplineResultTransformerImpl implements DisciplineResultTransformer {

	@Override
	public DisciplineResult transform(Discipline entity) {
		DisciplineResult result = new DisciplineResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		
		return result;
	}

}
