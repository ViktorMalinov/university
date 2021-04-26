package main.dataaccess.lecturer.dao;

import java.util.List;

import main.dataaccess.lecturer.repo.LecturerRepoManager;
import main.dataaccess.lecturer.repo.LecturerRepoManagerImpl;


public class LecturerDaoHMapImpl implements LecturerDao {

	private LecturerRepoManager repo = new LecturerRepoManagerImpl();
	
	
	@Override
	public Lecturer create(Lecturer entity) {
		Lecturer res = repo.insert(entity);
		return res;
	}

	@Override
	public Lecturer get(Long id) {
		Lecturer entity = repo.select(id);
		return entity;	
	}

	@Override
	public void update(Lecturer entity) {
		repo.update(entity);
	}

	@Override
	public void delete(Long id) {
		repo.delete(id);
	}
	
	@Override
	public List<Lecturer> selectAll() {
		List<Lecturer> allData = repo.selectAll();
		return allData;
	}



}
