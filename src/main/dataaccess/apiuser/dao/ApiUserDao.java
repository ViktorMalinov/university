package main.dataaccess.apiuser.dao;

import java.util.Set;

public interface ApiUserDao {

	ApiUser create(ApiUser obj);
	ApiUser get(Long id);
	void update(ApiUser obj);
	void delete(Long id);
	Set<Long> getKeySet();
}
