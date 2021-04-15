package main.dataaccess.apigroupuser;

import java.util.HashMap;
import java.util.Map;

public class ApiGroupUserDaoHMapImpl implements ApiGroupUserDao {

	private static Map<Long, ApiGroupUser> datasource = new HashMap<Long, ApiGroupUser>();
	
	@Override
	public ApiGroupUser create(ApiGroupUser obj) {
		datasource.put(obj.getId(), obj);
		return null;
	}

	@Override
	public ApiGroupUser get(Long id) {
		ApiGroupUser obj = datasource.get(id);
		return obj;
	}

	@Override
	public void update(ApiGroupUser obj) {
		datasource.put(obj.getId(), obj);

	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);
	}

}
