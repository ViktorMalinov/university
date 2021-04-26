package main.dataaccess.department.dao;

import java.util.List;

import main.dataaccess.department.repo.DepartmentRepoManager;
import main.dataaccess.department.repo.DepartmentRepoManagerImpl;


public class DepartmentDaoHMapImpl implements DepartmentDao {

	
	private DepartmentRepoManager repo = new DepartmentRepoManagerImpl();
	
	@Override
	public Department create(Department entity) {
		Department res = repo.insert(entity);
		return res;
	}

	@Override
	public Department get(Long id) {
		Department entity = repo.select(id);
		return entity;	
	}

	@Override
	public void update(Department entity) {
		repo.update(entity);
	}

	@Override
	public void delete(Long id) {
		repo.delete(id);

	}
	
	@Override
	public List<Department> selectAll() {
		List<Department> allData = repo.selectAll();
		return allData;
	}


}
