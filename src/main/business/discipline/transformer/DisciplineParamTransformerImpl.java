package main.business.discipline.transformer;

import main.dataaccess.discipline.Discipline;
import main.service.discipline.DisciplineParam;

public class DisciplineParamTransformerImpl implements DisciplineParamTransformer {

	@Override
	public Discipline transform(DisciplineParam obj) {
		Discipline res = new Discipline();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
