package main.dataaccess.faculty;


public interface FacultyDao {

	Faculty create(Faculty obj);
	Faculty get(Long id);
	void update(Faculty obj);
	void delete(Long id);

}
