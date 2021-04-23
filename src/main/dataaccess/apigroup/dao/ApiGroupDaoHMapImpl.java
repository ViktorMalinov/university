package main.dataaccess.apigroup.dao;

import java.util.List;
import java.util.Set;

import main.dataaccess.apigroup.repo.ApiGroupRepoManager;
import main.dataaccess.apigroup.repo.ApiGroupRepoManagerImpl;

public class ApiGroupDaoHMapImpl implements ApiGroupDao {

	private ApiGroupRepoManager repo = new ApiGroupRepoManagerImpl();
		
	@Override
	public ApiGroup create(ApiGroup entity) {
		ApiGroup res = repo.insert(entity);
		return res;
	}

	@Override
	public ApiGroup get(Long id) {
		ApiGroup entity = repo.select(id);
		return entity;
	}

	@Override
	public void update(ApiGroup entity) {
		repo.update(entity);
	}

	@Override
	public void delete(Long id) {
		repo.delete(id);
	}
	
	@Override
	public Set<Long> getKeySet() {
		Set<Long> res = repo.getKeySet();
		return res;
	}

	@Override
	public List<ApiGroup> selectAll() {
		List<ApiGroup> allData = repo.selectAll();
		return allData;
	}


}
