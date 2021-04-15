package main.business.discipline.transformer;

import main.dataaccess.discipline.Discipline;
import main.service.discipline.DisciplineResult;

public class DisciplineResultTransformerImpl implements DisciplineResultTransformer {

	@Override
	public DisciplineResult transform(Discipline obj) {
		DisciplineResult res = new DisciplineResult();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
