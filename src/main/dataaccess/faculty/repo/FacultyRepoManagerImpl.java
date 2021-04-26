package main.dataaccess.faculty.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.common.Utils;
import main.dataaccess.faculty.dao.Faculty;

public class FacultyRepoManagerImpl implements FacultyRepoManager {

	private static Map<Long, Faculty> datasource = new HashMap<Long, Faculty>();
	
	@Override
	public Faculty insert(Faculty entity) {

		Set<Long> idSet = datasource.keySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		

		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Faculty select(Long id) {
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
	public List<Faculty> selectAll() {
		List<Faculty> allData = (List<Faculty>) datasource.values();
		return allData;
	}

}
