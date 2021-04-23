package main.dataaccess.facultydiscipline.dao;

import java.util.Set;

public interface FacultyDisciplineDao {

	FacultyDiscipline create(FacultyDiscipline obj);
	FacultyDiscipline get(Long id);
	void update(FacultyDiscipline obj);
	void delete(Long id);
	Set<Long> getKeySet();
}
