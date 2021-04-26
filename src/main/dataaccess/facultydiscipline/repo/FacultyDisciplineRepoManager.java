package main.dataaccess.facultydiscipline.repo;

import java.util.List;

import main.dataaccess.facultydiscipline.dao.FacultyDiscipline;

public interface FacultyDisciplineRepoManager {

	FacultyDiscipline insert(FacultyDiscipline entity);
	FacultyDiscipline select(Long id);
	void update(FacultyDiscipline entity);
	void delete(Long id);
	List<FacultyDiscipline> selectAll();

}
