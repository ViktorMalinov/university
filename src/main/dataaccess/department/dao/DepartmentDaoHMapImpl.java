package main.dataaccess.department.dao;

import main.dataaccess.common.BaseDaoHMapImpl;
import main.dataaccess.common.BaseRepoManager;
import main.dataaccess.department.repo.DepartmentRepoManager;
import main.dataaccess.department.repo.DepartmentRepoManagerImpl;


public class DepartmentDaoHMapImpl extends BaseDaoHMapImpl <Long, Department> implements DepartmentDao {

	@Override
	public BaseRepoManager<Long, Department> getRepo() {
		DepartmentRepoManager repo = new DepartmentRepoManagerImpl();
		return repo;
	}

	
	/*
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
*/

}
