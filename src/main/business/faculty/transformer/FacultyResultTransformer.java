package main.business.faculty.transformer;

import main.dataaccess.faculty.Faculty;
import main.service.faculty.FacultyResult;

public interface FacultyResultTransformer {
	
	FacultyResult transform(Faculty entity);
}
