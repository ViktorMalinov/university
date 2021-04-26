package main.dataaccess.apiuser.repo;

import java.util.List;

import main.dataaccess.apiuser.dao.ApiUser;

public interface ApiUserRepoManager {

	ApiUser insert(ApiUser entity);
	ApiUser select(Long id);
	void update(ApiUser entity);
	void delete(Long id);
	List<ApiUser> selectAll();

}
