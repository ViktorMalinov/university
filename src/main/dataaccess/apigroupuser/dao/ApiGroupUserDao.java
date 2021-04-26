package main.dataaccess.apigroupuser.dao;

import java.util.List;

public interface ApiGroupUserDao {

	ApiGroupUser create(ApiGroupUser obj);
	ApiGroupUser get(Long id);
	void update(ApiGroupUser obj);
	void delete(Long id);
	List<ApiGroupUser> selectAll();
}
