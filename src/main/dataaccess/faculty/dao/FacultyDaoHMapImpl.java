package main.dataaccess.faculty.dao;

import java.util.List;

import main.dataaccess.faculty.repo.FacultyRepoManager;
import main.dataaccess.faculty.repo.FacultyRepoManagerImpl;


public class FacultyDaoHMapImpl implements FacultyDao {

	private FacultyRepoManager repo = new FacultyRepoManagerImpl();	
	
	@Override
	public Faculty create(Faculty entity) {
		Faculty res = repo.insert(entity);
		return res;
	}

	@Override
	public Faculty get(Long id) {
		Faculty entity = repo.select(id);
		return entity;	
	}

	@Override
	public void update(Faculty entity) {
		repo.update(entity);
	}

	@Override
	public void delete(Long id) {
		repo.delete(id);
	}


	@Override
	public List<Faculty> selectAll() {
		List<Faculty> allData = repo.selectAll();
		return allData;
	}

}
