package main.business.facultydiscipline.processor;

import main.service.facultydiscipline.FacultyDisciplineParam;
import main.service.facultydiscipline.FacultyDisciplineResult;

public interface FacultyDisciplineProcessor {

	FacultyDisciplineResult create(FacultyDisciplineParam param) throws Exception;
	FacultyDisciplineResult get(Long id) throws Exception;
	void update(FacultyDisciplineParam param) throws Exception;
	void delete(Long id);
	
}
