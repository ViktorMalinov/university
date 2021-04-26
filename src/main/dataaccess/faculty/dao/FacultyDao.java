package main.dataaccess.faculty.dao;

import java.util.List;

public interface FacultyDao {

	Faculty create(Faculty obj);
	Faculty get(Long id);
	void update(Faculty obj);
	void delete(Long id);
	List<Faculty> selectAll();
}
