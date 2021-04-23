package main.dataaccess.apigroup.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.dataaccess.apigroup.dao.ApiGroup;

public class ApiGroupRepoManagerImpl implements ApiGroupRepoManager {

	private static Map<Long, ApiGroup> datasource = new HashMap<Long, ApiGroup>();
	
	@Override
	public ApiGroup insert(ApiGroup entity) {
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public ApiGroup select(Long id) {
		ApiGroup entity = datasource.get(id);
		return entity;
	}

	@Override
	public void update(ApiGroup entity) {
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

	@Override
	public List<ApiGroup> selectAll() {
		List<ApiGroup> allData = (List<ApiGroup>) datasource.values();
		return allData;
	}

}
