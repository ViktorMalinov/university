package main.business.facultydiscipline.transformer;

import main.dataaccess.facultydiscipline.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineResult;

public class FacultyDisciplineResultTransformerImpl implements FacultyDisciplineResultTransformer {

	@Override
	public FacultyDisciplineResult transform(FacultyDiscipline entity) {
		FacultyDisciplineResult result = new FacultyDisciplineResult();
		
		result.setId(entity.getId());
		result.setDisciplineId(entity.getDisciplineId());
		result.setFacultyId(entity.getFacultyId());
		
		return result;
	}

}
