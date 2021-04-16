package main.business.faculty.processor;

import main.service.faculty.FacultyParam;
import main.service.faculty.FacultyResult;

public interface FacultyProcessor {
	
	FacultyResult create(FacultyParam param);
	FacultyResult get(Long id);
	void update(FacultyParam param);
	void delete(Long id);

}
