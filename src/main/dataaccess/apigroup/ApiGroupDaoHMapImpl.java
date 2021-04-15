package main.dataaccess.apigroup;

import java.util.HashMap;
import java.util.Map;

public class ApiGroupDaoHMapImpl implements ApiGroupDao {

	private static Map<Long, ApiGroup> datasource = new HashMap<Long, ApiGroup>();
	
	
		
	@Override
	public ApiGroup create(ApiGroup obj) {
		datasource.put(obj.getId(), obj);
		return obj;
	}

	@Override
	public ApiGroup get(Long id) {
		ApiGroup obj = datasource.get(id);
		return obj;
	}

	@Override
	public void update(ApiGroup obj) {
		datasource.put(obj.getId(), obj);
	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);
	}

}
