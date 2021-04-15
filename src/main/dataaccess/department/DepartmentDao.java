package main.dataaccess.department;

public interface DepartmentDao {

	Department create(Department obj);
	Department get(Long id);
	void update(Department obj);
	void delete(Long id);
}
