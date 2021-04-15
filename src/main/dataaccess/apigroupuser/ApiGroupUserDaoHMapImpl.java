package main.dataaccess.apigroupuser;

import java.util.HashMap;
import java.util.Map;

public class ApiGroupUserDaoHMapImpl implements ApiGroupUserDao {

	private static Map<Long, ApiGroupUser> datasource = new HashMap<Long, ApiGroupUser>();
	
	@Override
	public ApiGroupUser create(ApiGroupUser gu) {
		datasource.put(gu.getId(), gu);
		return null;
	}

	@Override
	public ApiGroupUser get(Long id) {
		ApiGroupUser gu = datasource.get(id);
		return gu;
	}

	@Override
	public void update(ApiGroupUser gu) {
		datasource.put(gu.getId(), gu);

	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);

	}

}
