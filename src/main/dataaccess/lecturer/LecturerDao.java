package main.dataaccess.lecturer;

import java.util.Set;

public interface LecturerDao {

	Lecturer create(Lecturer obj);
	Lecturer get(Long id);
	void update(Lecturer obj);
	void delete(Long id);
	Set<Long> getKeySet();
}
