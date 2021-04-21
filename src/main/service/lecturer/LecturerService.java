package main.service.lecturer;

public interface LecturerService {

	LecturerResult create(LecturerParam param) throws Exception;
	LecturerResult get(Long id) throws Exception;
	void update(LecturerParam param) throws Exception;
	void delete(Long id);
	
}
