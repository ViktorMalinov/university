package main.dataaccess.lecturer.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class LecturerDaoHMapImpl implements LecturerDao {

	private static Map<Long, Lecturer> datasource = new HashMap<Long, Lecturer>();
	
	
	@Override
	public Lecturer create(Lecturer entity) {
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Lecturer get(Long id) {
		Lecturer entity = datasource.get(id);
		return entity;	
	}

	@Override
	public void update(Lecturer entity) {
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
