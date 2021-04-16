package main.business.lecturer.processor;

import main.service.lecturer.LecturerParam;
import main.service.lecturer.LecturerResult;

public interface LecturerProcessor {

	LecturerResult create(LecturerParam param);
	LecturerResult get(Long id);
	void update(LecturerParam param);
	void delete(Long id);

}
