package main.dataaccess.discipline.dao;

import java.util.List;

import main.dataaccess.discipline.repo.DisciplineRepoManager;
import main.dataaccess.discipline.repo.DisciplineRepoManagerImpl;


public class DisciplineDaoHMapImpl implements DisciplineDao {

	private DisciplineRepoManager repo = new DisciplineRepoManagerImpl();
	
	@Override
	public Discipline create(Discipline entity) {
		Discipline res = repo.insert(entity);
		return res;
	}

	@Override
	public Discipline get(Long id) {
		Discipline entity = repo.select(id);
		return entity;	
	}

	@Override
	public void update(Discipline entity) {
		repo.update(entity);
	}

	@Override
	public void delete(Long id) {
		repo.delete(id);
	}
	
	@Override
	public List<Discipline> selectAll() {
		List<Discipline> allData = repo.selectAll();
		return allData;
	}


}
