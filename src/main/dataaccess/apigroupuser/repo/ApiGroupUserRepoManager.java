package main.dataaccess.apigroupuser.repo;

import java.util.List;

import main.dataaccess.apigroupuser.dao.ApiGroupUser;

public interface ApiGroupUserRepoManager {

	ApiGroupUser insert(ApiGroupUser entity);
	ApiGroupUser select(Long id);
	void update(ApiGroupUser entity);
	void delete(Long id);
	List<ApiGroupUser> selectAll();

}
