package main.dataaccess.speciality;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class SpecialityDaoHMapImpl implements SpecialityDao {

	private static Map<Long, Speciality> datasource = new HashMap<Long, Speciality>();
	
	
	@Override
	public Speciality create(Speciality entity) {
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Speciality get(Long id) {
		Speciality entity = datasource.get(id);
		return entity;	
	}

	@Override
	public void update(Speciality entity) {
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
