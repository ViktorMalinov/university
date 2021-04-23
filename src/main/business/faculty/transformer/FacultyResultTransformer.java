package main.business.faculty.transformer;

import main.dataaccess.faculty.dao.Faculty;
import main.service.faculty.FacultyResult;

public interface FacultyResultTransformer {
	
	FacultyResult transform(Faculty entity);
}
