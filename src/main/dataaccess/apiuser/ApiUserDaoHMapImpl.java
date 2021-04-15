package main.dataaccess.apiuser;

import java.util.HashMap;
import java.util.Map;



public class ApiUserDaoHMapImpl implements ApiUserDao {

	private static Map<Long, ApiUser> datasource = new HashMap<Long, ApiUser>();
	
	
	@Override
	public ApiUser create(ApiUser obj) {
		datasource.put(obj.getId(), obj);
		return obj;
	}

	@Override
	public ApiUser get(Long id) {
		ApiUser obj = datasource.get(id);
		return obj;	
	}

	@Override
	public void update(ApiUser obj) {
		datasource.put(obj.getId(), obj);
	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);
	}

}
