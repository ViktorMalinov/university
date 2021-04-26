package main.dataaccess.apiuser.dao;

import java.util.List;

import main.dataaccess.apiuser.repo.ApiUserRepoManager;
import main.dataaccess.apiuser.repo.ApiUserRepoManagerImpl;



public class ApiUserDaoHMapImpl implements ApiUserDao {

	private ApiUserRepoManager repo = new ApiUserRepoManagerImpl(); 
	
	
	@Override
	public ApiUser create(ApiUser entity) {
		ApiUser res = repo.insert(entity);
		return res;
	}

	@Override
	public ApiUser get(Long id) {
		ApiUser entity = repo.select(id);
		return entity;	
	}

	@Override
	public void update(ApiUser entity) {
		repo.update(entity);
	}

	@Override
	public void delete(Long id) {
		repo.delete(id);
	}

	@Override
	public List<ApiUser> selectAll() {
		List<ApiUser> allData = repo.selectAll();
		return allData;
	}

}
