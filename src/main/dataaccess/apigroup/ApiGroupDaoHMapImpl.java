package main.dataaccess.apigroup;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ApiGroupDaoHMapImpl implements ApiGroupDao {

	private static Map<Long, ApiGroup> datasource = new HashMap<Long, ApiGroup>();
	
	
		
	@Override
	public ApiGroup create(ApiGroup entity) {
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public ApiGroup get(Long id) {
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


}
