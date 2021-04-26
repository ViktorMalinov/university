package main.dataaccess.department.repo;

import java.util.List;

import main.dataaccess.department.dao.Department;

public interface DepartmentRepoManager {

	Department insert(Department entity);
	Department select(Long id);
	void update(Department entity);
	void delete(Long id);
	List<Department> selectAll();
}
