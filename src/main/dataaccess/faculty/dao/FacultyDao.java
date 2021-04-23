package main.dataaccess.faculty.dao;

import java.util.Set;

public interface FacultyDao {

	Faculty create(Faculty obj);
	Faculty get(Long id);
	void update(Faculty obj);
	void delete(Long id);
	Set<Long> getKeySet();
}
