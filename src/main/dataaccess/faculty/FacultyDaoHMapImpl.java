package main.dataaccess.faculty;

import java.util.HashMap;
import java.util.Map;


public class FacultyDaoHMapImpl implements FacultyDao {

	
	private static Map<Long, Faculty> datasource = new HashMap<Long, Faculty>();
	
	
	@Override
	public Faculty create(Faculty obj) {
		datasource.put(obj.getId(), obj);
		return obj;
	}

	@Override
	public Faculty get(Long id) {
		Faculty obj = datasource.get(id);
		return obj;	
	}

	@Override
	public void update(Faculty obj) {
		datasource.put(obj.getId(), obj);
	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);
	}

}
