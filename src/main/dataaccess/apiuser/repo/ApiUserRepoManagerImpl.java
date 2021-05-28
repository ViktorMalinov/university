package main.dataaccess.apiuser.repo;

import java.util.HashMap;
import java.util.Map;

import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.common.PersistentRepoManagerImpl;

public class ApiUserRepoManagerImpl extends PersistentRepoManagerImpl<ApiUser> implements ApiUserRepoManager {

	private static Map<Long, ApiUser> datasource = new HashMap<Long, ApiUser>();

	@Override
	public Map<Long, ApiUser> getDataSource() {
		return datasource;
	}

}
