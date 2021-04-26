package main.dataaccess.facultydiscipline.dao;

import java.util.List;

import main.dataaccess.facultydiscipline.repo.FacultyDisciplineRepoManager;
import main.dataaccess.facultydiscipline.repo.FacultyDisciplineRepoManagerImpl;


public class FacultyDisciplineDaoHMapImpl implements FacultyDisciplineDao {

	private FacultyDisciplineRepoManager repo = new FacultyDisciplineRepoManagerImpl();	
	
	@Override
	public FacultyDiscipline create(FacultyDiscipline entity) {
		FacultyDiscipline res = repo.insert(entity);
		return res;
	}

	@Override
	public FacultyDiscipline get(Long id) {
		FacultyDiscipline entity = repo.select(id);
		return entity;	
	}

	@Override
	public void update(FacultyDiscipline entity) {
		repo.update(entity);
	}

	@Override
	public void delete(Long id) {
		repo.delete(id);
	}
	
	@Override
	public List<FacultyDiscipline> selectAll() {
		List<FacultyDiscipline> allData = repo.selectAll();
		return allData;
	}
}
