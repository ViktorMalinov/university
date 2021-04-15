package main.dataaccess.lecturer;


public interface LecturerDao {

	Lecturer create(Lecturer obj);
	Lecturer get(Long id);
	void update(Lecturer obj);
	void delete(Long id);

}
