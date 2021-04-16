package main.service.faculty;

public interface FacultyService {

	FacultyResult create(FacultyParam param);
	FacultyResult get(Long id);
	void update(FacultyParam param);
	void delete(Long id);

}
