package main.business.facultydiscipline.transformer;

import main.dataaccess.facultydiscipline.dao.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineResult;

public class FacultyDisciplineResultTransformerImpl implements FacultyDisciplineResultTransformer {

	@Override
	public FacultyDisciplineResult transform(FacultyDiscipline entity) throws Exception {
		FacultyDisciplineResult result = new FacultyDisciplineResult();
		
		result.setId(entity.getId());
		
		
		if (entity.getDiscipline() == null) {
			throw new Exception("The object Discipline was NOT found!");
		}
		
		if (entity.getDiscipline().getName().isEmpty()) {
			throw new Exception("The Discipline NAME is empty!");
		}
		
		if (entity.getFaculty() == null) {
			throw new Exception("The object Faculty was NOT found!");
		}
		
		if (entity.getFaculty().getName().isEmpty()) {
			throw new Exception("The Faculty NAME is empty!");
		}
		
				
		result.setDisciplineId(entity.getDiscipline().getId());
		result.setDisciplineName(entity.getDiscipline().getName());
		
		result.setFacultyId(entity.getFaculty().getId());
		result.setFacultyName(entity.getFaculty().getName());
		
		return result;
	}

}
