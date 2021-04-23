package main.business.faculty.processor;

import main.service.faculty.FacultyParam;
import main.service.faculty.FacultyResult;

public interface FacultyProcessor {
	
	FacultyResult create(FacultyParam param) throws Exception;
	FacultyResult get(Long id) throws Exception;
	void update(FacultyParam param) throws Exception;
	void delete(Long id);

}
