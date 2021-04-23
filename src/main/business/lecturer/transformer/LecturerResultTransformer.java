package main.business.lecturer.transformer;

import main.dataaccess.lecturer.dao.Lecturer;
import main.service.lecturer.LecturerResult;

public interface LecturerResultTransformer {

	LecturerResult transform(Lecturer entity) throws Exception;
}
