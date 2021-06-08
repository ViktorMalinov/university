package main.dataaccess.apigroupuser.repo;

import java.util.HashMap;
import java.util.Map;

import main.dataaccess.apigroupuser.dao.ApiGroupUser;
import main.dataaccess.common.PersistentRepoManagerImpl;

public class ApiGroupUserRepoManagerImpl extends PersistentRepoManagerImpl<ApiGroupUser> implements ApiGroupUserRepoManager {

	private static Map<Long, ApiGroupUser> datasource = new HashMap<Long, ApiGroupUser>();

	@Override
	public Map<Long, ApiGroupUser> getDataSource() {
		return datasource;
	}

}
