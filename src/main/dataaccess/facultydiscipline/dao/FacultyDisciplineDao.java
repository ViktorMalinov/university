package main.dataaccess.facultydiscipline.dao;

import java.util.List;

public interface FacultyDisciplineDao {

	FacultyDiscipline create(FacultyDiscipline obj);
	FacultyDiscipline get(Long id);
	void update(FacultyDiscipline obj);
	void delete(Long id);
	List<FacultyDiscipline> selectAll();
}
