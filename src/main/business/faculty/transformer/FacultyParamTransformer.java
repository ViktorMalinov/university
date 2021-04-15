package main.business.faculty.transformer;

import main.dataaccess.faculty.Faculty;
import main.service.faculty.FacultyParam;

public interface FacultyParamTransformer {

	Faculty transform(FacultyParam obj);
}
