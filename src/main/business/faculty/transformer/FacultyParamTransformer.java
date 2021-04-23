package main.business.faculty.transformer;

import main.dataaccess.faculty.dao.Faculty;
import main.service.faculty.FacultyParam;

public interface FacultyParamTransformer {

	Faculty transform(FacultyParam param) throws Exception;
}
