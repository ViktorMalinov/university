package main.dataaccess.apigroupuser.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ApiGroupUserDaoHMapImpl implements ApiGroupUserDao {

	private static Map<Long, ApiGroupUser> datasource = new HashMap<Long, ApiGroupUser>();
	
	@Override
	public ApiGroupUser create(ApiGroupUser entity) {
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public ApiGroupUser get(Long id) {
		ApiGroupUser entity = datasource.get(id);
		return entity;
	}

	@Override
	public void update(ApiGroupUser entity) {
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
