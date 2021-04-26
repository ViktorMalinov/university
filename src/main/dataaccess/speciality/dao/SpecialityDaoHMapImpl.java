package main.dataaccess.speciality.dao;

import java.util.List;

import main.dataaccess.speciality.repo.SpecialityRepoManager;
import main.dataaccess.speciality.repo.SpecialityRepoManagerImpl;


public class SpecialityDaoHMapImpl implements SpecialityDao {

	private SpecialityRepoManager repo = new SpecialityRepoManagerImpl();
	
	
	@Override
	public Speciality create(Speciality entity) {
		Speciality res = repo.insert(entity);
		return res;
	}

	@Override
	public Speciality get(Long id) {
		Speciality entity = repo.select(id);
		return entity;	
	}

	@Override
	public void update(Speciality entity) {
		repo.update(entity);
	}

	@Override
	public void delete(Long id) {
		repo.delete(id);
	}

	@Override
	public List<Speciality> selectAll() {
		List<Speciality> allData = repo.selectAll();
		return allData;
	}

}
