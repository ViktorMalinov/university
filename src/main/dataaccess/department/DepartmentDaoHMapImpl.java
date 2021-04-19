package main.dataaccess.department;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DepartmentDaoHMapImpl implements DepartmentDao {

	private static Map<Long, Department> datasource = new HashMap<Long, Department>();
	
	
	
	@Override
	public Department create(Department entity) {
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Department get(Long id) {
		Department entity = datasource.get(id);
		return entity;	
	}

	@Override
	public void update(Department entity) {
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
