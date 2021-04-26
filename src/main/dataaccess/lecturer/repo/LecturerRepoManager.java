package main.dataaccess.lecturer.repo;

import java.util.List;

import main.dataaccess.lecturer.dao.Lecturer;

public interface LecturerRepoManager {

	Lecturer insert(Lecturer entity);
	Lecturer select(Long id);
	void update(Lecturer entity);
	void delete(Long id);
	List<Lecturer> selectAll();
}
