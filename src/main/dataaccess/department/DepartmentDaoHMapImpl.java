package main.dataaccess.department;

import java.util.HashMap;
import java.util.Map;


public class DepartmentDaoHMapImpl implements DepartmentDao {

	private static Map<Long, Department> datasource = new HashMap<Long, Department>();
	
	
	
	@Override
	public Department create(Department obj) {
		datasource.put(obj.getId(), obj);
		return obj;
	}

	@Override
	public Department get(Long id) {
		Department obj = datasource.get(id);
		return obj;	
	}

	@Override
	public void update(Department obj) {
		datasource.put(obj.getId(), obj);
	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);

	}

}
