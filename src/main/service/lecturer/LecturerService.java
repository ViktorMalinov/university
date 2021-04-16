package main.service.lecturer;

public interface LecturerService {

	LecturerResult create(LecturerParam param);
	LecturerResult get(Long id);
	void update(LecturerParam param);
	void delete(Long id);
	
}
