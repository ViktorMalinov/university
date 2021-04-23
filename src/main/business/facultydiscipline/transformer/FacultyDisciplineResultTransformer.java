package main.business.facultydiscipline.transformer;

import main.dataaccess.facultydiscipline.dao.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineResult;

public interface FacultyDisciplineResultTransformer {

	FacultyDisciplineResult transform(FacultyDiscipline entity) throws Exception;
}
