package main.dataaccess.apiuser.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class ApiUserDaoHMapImpl implements ApiUserDao {

	private static Map<Long, ApiUser> datasource = new HashMap<Long, ApiUser>();
	
	
	@Override
	public ApiUser create(ApiUser entity) {
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public ApiUser get(Long id) {
		ApiUser entity = datasource.get(id);
		return entity;	
	}

	@Override
	public void update(ApiUser entity) {
		datasource.put(entity.getId(), entity);
	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);
	}

	@Override
	public Set<Long> getKeySet() {
		Set<Long> res = datasource.keySet();
		return res;
	}

}
