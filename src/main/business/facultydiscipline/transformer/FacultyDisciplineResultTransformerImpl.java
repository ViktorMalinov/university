package main.business.facultydiscipline.transformer;

import main.dataaccess.facultydiscipline.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineResult;

public class FacultyDisciplineResultTransformerImpl implements FacultyDisciplineResultTransformer {

	@Override
	public FacultyDisciplineResult transform(FacultyDiscipline obj) {
		FacultyDisciplineResult res = new FacultyDisciplineResult();
		
		res.setId(obj.getId());
		res.setDisciplineId(obj.getDisciplineId());
		res.setFacultyId(obj.getFacultyId());
		
		return res;
	}

}
