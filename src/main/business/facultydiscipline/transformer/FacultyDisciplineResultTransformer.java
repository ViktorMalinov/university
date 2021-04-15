package main.business.facultydiscipline.transformer;

import main.dataaccess.facultydiscipline.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineResult;

public interface FacultyDisciplineResultTransformer {

	FacultyDisciplineResult transform(FacultyDiscipline obj);
}
