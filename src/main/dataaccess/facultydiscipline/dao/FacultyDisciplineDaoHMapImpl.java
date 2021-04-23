package main.dataaccess.facultydiscipline.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FacultyDisciplineDaoHMapImpl implements FacultyDisciplineDao {

	private static Map<Long, FacultyDiscipline> datasource = new HashMap<Long, FacultyDiscipline>();
	
	
	@Override
	public FacultyDiscipline create(FacultyDiscipline entity) {
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public FacultyDiscipline get(Long id) {
		FacultyDiscipline entity = datasource.get(id);
		return entity;	
	}

	@Override
	public void update(FacultyDiscipline entity) {
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
