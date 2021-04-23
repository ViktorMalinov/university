package main.service.faculty;

public interface FacultyService {

	FacultyResult create(FacultyParam param) throws Exception;
	FacultyResult get(Long id) throws Exception;
	void update(FacultyParam param) throws Exception;
	void delete(Long id);

}
