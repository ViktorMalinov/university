package main.business.lecturer.processor;

import main.service.lecturer.LecturerParam;
import main.service.lecturer.LecturerResult;

public interface LecturerProcessor {

	LecturerResult create(LecturerParam param) throws Exception;
	LecturerResult get(Long id) throws Exception;
	void update(LecturerParam param) throws Exception;
	void delete(Long id);

}
