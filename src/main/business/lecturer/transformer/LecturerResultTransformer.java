package main.business.lecturer.transformer;

import main.dataaccess.lecturer.Lecturer;
import main.service.lecturer.LecturerResult;

public interface LecturerResultTransformer {

	LecturerResult transform(Lecturer obj);
}
