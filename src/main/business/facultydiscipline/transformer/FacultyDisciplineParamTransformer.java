package main.business.facultydiscipline.transformer;

import main.dataaccess.facultydiscipline.dao.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineParam;

public interface FacultyDisciplineParamTransformer {

	FacultyDiscipline transform(FacultyDisciplineParam param) throws Exception;
}
