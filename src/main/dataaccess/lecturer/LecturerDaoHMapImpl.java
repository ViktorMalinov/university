package main.dataaccess.lecturer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class LecturerDaoHMapImpl implements LecturerDao {

	private static Map<Long, Lecturer> datasource = new HashMap<Long, Lecturer>();
	
	
	@Override
	public Lecturer create(Lecturer obj) {
		datasource.put(obj.getId(), obj);
		return obj;
	}

	@Override
	public Lecturer get(Long id) {
		Lecturer obj = datasource.get(id);
		return obj;	
	}

	@Override
	public void update(Lecturer obj) {
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
