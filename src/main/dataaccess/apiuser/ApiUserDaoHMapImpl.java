package main.dataaccess.apiuser;

import java.util.HashMap;
import java.util.Map;



public class ApiUserDaoHMapImpl implements ApiUserDao {

	private static Map<Long, ApiUser> datasource = new HashMap<Long, ApiUser>();
	
	
	@Override
	public ApiUser create(ApiUser usr) {
		datasource.put(usr.getId(), usr);
		return usr;
	}

	@Override
	public ApiUser get(Long id) {
		ApiUser usr = datasource.get(id);
		return usr;	}

	@Override
	public void update(ApiUser usr) {
		datasource.put(usr.getId(), usr);

	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);
	}

}
