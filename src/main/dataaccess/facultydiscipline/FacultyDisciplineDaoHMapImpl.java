package main.dataaccess.facultydiscipline;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FacultyDisciplineDaoHMapImpl implements FacultyDisciplineDao {

	private static Map<Long, FacultyDiscipline> datasource = new HashMap<Long, FacultyDiscipline>();
	
	
	@Override
	public FacultyDiscipline create(FacultyDiscipline obj) {
		datasource.put(obj.getId(), obj);
		return obj;
	}

	@Override
	public FacultyDiscipline get(Long id) {
		FacultyDiscipline obj = datasource.get(id);
		return obj;	
	}

	@Override
	public void update(FacultyDiscipline obj) {
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
