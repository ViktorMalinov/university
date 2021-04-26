package main.dataaccess.apigroupuser.dao;

import java.util.List;

import main.dataaccess.apigroupuser.repo.ApiGroupUserRepoManager;
import main.dataaccess.apigroupuser.repo.ApiGroupUserRepoManagerImpl;

public class ApiGroupUserDaoHMapImpl implements ApiGroupUserDao {

	private ApiGroupUserRepoManager repo = new ApiGroupUserRepoManagerImpl();
	
	@Override
	public ApiGroupUser create(ApiGroupUser entity) {
		ApiGroupUser res = repo.insert(entity);
		return res;
	}

	@Override
	public ApiGroupUser get(Long id) {
		ApiGroupUser entity = repo.select(id);
		return entity;
	}

	@Override
	public void update(ApiGroupUser entity) {
		repo.update(entity);
	}

	@Override
	public void delete(Long id) {
		repo.delete(id);
	}
	
	@Override
	public List<ApiGroupUser> selectAll() {
		List<ApiGroupUser> allData = repo.selectAll();
		return allData;
	}


}
