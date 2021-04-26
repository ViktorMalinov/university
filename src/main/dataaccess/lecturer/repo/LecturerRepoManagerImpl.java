package main.dataaccess.lecturer.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.common.Utils;
import main.dataaccess.lecturer.dao.Lecturer;

public class LecturerRepoManagerImpl implements LecturerRepoManager {

	private static Map<Long, Lecturer> datasource = new HashMap<Long, Lecturer>();
	
	@Override
	public Lecturer insert(Lecturer entity) {
		
		Set<Long> idSet = datasource.keySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Lecturer select(Long id) {
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
	public List<Lecturer> selectAll() {
		List<Lecturer> allData = (List<Lecturer>) datasource.values();
		return allData;
	}

}
