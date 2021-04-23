package main.dataaccess.department.dao;

import java.util.Set;

public interface DepartmentDao {

	Department create(Department obj);
	Department get(Long id);
	void update(Department obj);
	void delete(Long id);
	Set<Long> getKeySet();
}
