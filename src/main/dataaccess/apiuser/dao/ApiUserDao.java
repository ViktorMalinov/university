package main.dataaccess.apiuser.dao;

import java.util.List;

public interface ApiUserDao {

	ApiUser create(ApiUser obj);
	ApiUser get(Long id);
	void update(ApiUser obj);
	void delete(Long id);
	List<ApiUser> selectAll();

}
