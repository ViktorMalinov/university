package main.dataaccess.faculty.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FacultyDaoHMapImpl implements FacultyDao {

	
	private static Map<Long, Faculty> datasource = new HashMap<Long, Faculty>();
	
	
	@Override
	public Faculty create(Faculty entity) {
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Faculty get(Long id) {
		Faculty entity = datasource.get(id);
		return entity;	
	}

	@Override
	public void update(Faculty entity) {
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
