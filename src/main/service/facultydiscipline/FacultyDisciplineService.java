package main.service.facultydiscipline;

public interface FacultyDisciplineService {

	FacultyDisciplineResult create(FacultyDisciplineParam param) throws Exception;
	FacultyDisciplineResult get(Long id) throws Exception;
	void update(FacultyDisciplineParam param) throws Exception;
	void delete(Long id);
}
