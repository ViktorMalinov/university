package main.business.facultydiscipline.transformer;

import main.dataaccess.facultydiscipline.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineParam;

public class FacultyDisciplineParamTransformerImpl implements FacultyDisciplineParamTransformer {

	@Override
	public FacultyDiscipline transform(FacultyDisciplineParam param) {
		FacultyDiscipline entity = new FacultyDiscipline();
		
		entity.setId(param.getId());
		entity.setDisciplineId(param.getDisciplineId());
		entity.setFacultyId(param.getFacultyId());
		
		return entity;
	}

}
