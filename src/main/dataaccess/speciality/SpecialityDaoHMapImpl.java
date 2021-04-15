package main.dataaccess.speciality;

import java.util.HashMap;
import java.util.Map;


public class SpecialityDaoHMapImpl implements SpecialityDao {

	private static Map<Long, Speciality> datasource = new HashMap<Long, Speciality>();
	
	
	@Override
	public Speciality create(Speciality obj) {
		datasource.put(obj.getId(), obj);
		return obj;
	}

	@Override
	public Speciality get(Long id) {
		Speciality obj = datasource.get(id);
		return obj;	
	}

	@Override
	public void update(Speciality obj) {
		datasource.put(obj.getId(), obj);
	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);
	}

}
