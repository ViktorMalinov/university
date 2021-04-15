package main.dataaccess.apigroup;

import java.util.HashMap;
import java.util.Map;

public class ApiGroupDaoHMapImpl implements ApiGroupDao {

	private static Map<Long, ApiGroup> datasource = new HashMap<Long, ApiGroup>();
	
	
	@Override
	public ApiGroup create(ApiGroup grp) {
		datasource.put(grp.getId(), grp);
		return grp;
	}

	@Override
	public ApiGroup get(Long id) {
		ApiGroup grp = datasource.get(id);
		return grp;
	}

	@Override
	public void update(ApiGroup grp) {
		datasource.put(grp.getId(), grp);
	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);
	}

}
