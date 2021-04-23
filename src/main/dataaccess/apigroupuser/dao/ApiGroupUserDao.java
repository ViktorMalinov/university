package main.dataaccess.apigroupuser.dao;

import java.util.Set;

public interface ApiGroupUserDao {

	ApiGroupUser create(ApiGroupUser obj);
	ApiGroupUser get(Long id);
	void update(ApiGroupUser obj);
	void delete(Long id);
	Set<Long> getKeySet();
}
