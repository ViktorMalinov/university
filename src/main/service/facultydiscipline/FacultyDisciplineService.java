package main.service.facultydiscipline;

public interface FacultyDisciplineService {

	FacultyDisciplineResult create(FacultyDisciplineParam param);
	FacultyDisciplineResult get(Long id);
	void update(FacultyDisciplineParam param);
	void delete(Long id);
}
