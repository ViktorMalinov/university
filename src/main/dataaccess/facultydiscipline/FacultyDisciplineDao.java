package main.dataaccess.facultydiscipline;


public interface FacultyDisciplineDao {

	FacultyDiscipline create(FacultyDiscipline obj);
	FacultyDiscipline get(Long id);
	void update(FacultyDiscipline obj);
	void delete(Long id);

}
