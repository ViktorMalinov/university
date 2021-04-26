package main.dataaccess.faculty.repo;

import java.util.List;

import main.dataaccess.faculty.dao.Faculty;

public interface FacultyRepoManager {

	Faculty insert(Faculty entity);
	Faculty select(Long id);
	void update(Faculty entity);
	void delete(Long id);
	List<Faculty> selectAll();

}
