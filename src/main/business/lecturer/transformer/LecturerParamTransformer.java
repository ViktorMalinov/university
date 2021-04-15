package main.business.lecturer.transformer;

import main.dataaccess.lecturer.Lecturer;
import main.service.lecturer.LecturerParam;

public interface LecturerParamTransformer {
	
	Lecturer transform(LecturerParam obj);

}
