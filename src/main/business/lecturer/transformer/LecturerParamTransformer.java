package main.business.lecturer.transformer;

import main.dataaccess.lecturer.dao.Lecturer;
import main.service.lecturer.LecturerParam;

public interface LecturerParamTransformer {
	
	Lecturer transform(LecturerParam param) throws Exception;

}
