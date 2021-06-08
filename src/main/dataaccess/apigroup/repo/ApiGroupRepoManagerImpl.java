package main.dataaccess.apigroup.repo;

import java.util.HashMap;
import java.util.Map;

import main.dataaccess.apigroup.dao.ApiGroup;
import main.dataaccess.common.PersistentRepoManagerImpl;

public class ApiGroupRepoManagerImpl extends PersistentRepoManagerImpl<ApiGroup> implements ApiGroupRepoManager {

	private static Map<Long, ApiGroup> datasource = new HashMap<Long, ApiGroup>();

	@Override
	public Map<Long, ApiGroup> getDataSource() {
		return datasource;
	}

	public String getPath() {
		return "D:\\workspace\\Java\\Test\\University\\resources\\ApiGroup.json";
	}

}
