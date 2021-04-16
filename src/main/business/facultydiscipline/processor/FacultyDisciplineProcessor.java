package main.business.facultydiscipline.processor;

import main.service.facultydiscipline.FacultyDisciplineParam;
import main.service.facultydiscipline.FacultyDisciplineResult;

public interface FacultyDisciplineProcessor {

	FacultyDisciplineResult create(FacultyDisciplineParam param);
	FacultyDisciplineResult get(Long id);
	void update(FacultyDisciplineParam param);
	void delete(Long id);
	
}
