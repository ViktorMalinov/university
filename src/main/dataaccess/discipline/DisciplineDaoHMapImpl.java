package main.dataaccess.discipline;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class DisciplineDaoHMapImpl implements DisciplineDao {

	private static Map<Long, Discipline> datasource = new HashMap<Long, Discipline>();
	
	@Override
	public Discipline create(Discipline obj) {
		datasource.put(obj.getId(), obj);
		return obj;
	}

	@Override
	public Discipline get(Long id) {
		Discipline obj = datasource.get(id);
		return obj;	
	}

	@Override
	public void update(Discipline obj) {
		datasource.put(obj.getId(), obj);
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
