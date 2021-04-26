package main.dataaccess.speciality.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.common.Utils;
import main.dataaccess.speciality.dao.Speciality;

public class SpecialityRepoManagerImpl implements SpecialityRepoManager {

	private static Map<Long, Speciality> datasource = new HashMap<Long, Speciality>();
	
	@Override
	public Speciality insert(Speciality entity) {

		Set<Long> idSet = datasource.keySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Speciality select(Long id) {
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
	public List<Speciality> selectAll() {
		List<Speciality> allData = (List<Speciality>) datasource.values();
		return allData;
	}

}
