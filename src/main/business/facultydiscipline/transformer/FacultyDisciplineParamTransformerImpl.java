package main.business.facultydiscipline.transformer;

import main.dataaccess.facultydiscipline.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineParam;

public class FacultyDisciplineParamTransformerImpl implements FacultyDisciplineParamTransformer {

	@Override
	public FacultyDiscipline transform(FacultyDisciplineParam obj) {
		FacultyDiscipline res = new FacultyDiscipline();
		
		res.setId(obj.getId());
		res.setDisciplineId(obj.getDisciplineId());
		res.setFacultyId(obj.getFacultyId());
		
		return res;
	}

}
