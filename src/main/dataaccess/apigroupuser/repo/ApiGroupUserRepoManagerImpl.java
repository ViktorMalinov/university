package main.dataaccess.apigroupuser.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.common.Utils;
import main.dataaccess.apigroupuser.dao.ApiGroupUser;

public class ApiGroupUserRepoManagerImpl implements ApiGroupUserRepoManager {

	private static Map<Long, ApiGroupUser> datasource = new HashMap<Long, ApiGroupUser>();
	
	@Override
	public ApiGroupUser insert(ApiGroupUser entity) {

		Set<Long> idSet = datasource.keySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public ApiGroupUser select(Long id) {
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
	public List<ApiGroupUser> selectAll() {
		List<ApiGroupUser> allData = (List<ApiGroupUser>) datasource.values();
		return allData;
	}

}
