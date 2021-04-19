package main.dataaccess.discipline;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DisciplineDaoHMapImpl implements DisciplineDao {

	private static Map<Long, Discipline> datasource = new HashMap<Long, Discipline>();
	
	@Override
	public Discipline create(Discipline entity) {
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Discipline get(Long id) {
		Discipline entity = datasource.get(id);
		return entity;	
	}

	@Override
	public void update(Discipline entity) {
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
