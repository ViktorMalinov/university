package main.dataaccess.apiuser.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.common.Utils;
import main.dataaccess.apiuser.dao.ApiUser;

public class ApiUserRepoManagerImpl implements ApiUserRepoManager {

	private static Map<Long, ApiUser> datasource = new HashMap<Long, ApiUser>();
	
	@Override
	public ApiUser insert(ApiUser entity) {
		
		Set<Long> idSet = datasource.keySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public ApiUser select(Long id) {
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
	public List<ApiUser> selectAll() {
		List<ApiUser> allData = (List<ApiUser>) datasource.values();
		return allData;
	}

}
