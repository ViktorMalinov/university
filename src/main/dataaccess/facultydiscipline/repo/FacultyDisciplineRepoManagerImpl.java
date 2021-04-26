package main.dataaccess.facultydiscipline.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.common.Utils;
import main.dataaccess.facultydiscipline.dao.FacultyDiscipline;

public class FacultyDisciplineRepoManagerImpl implements FacultyDisciplineRepoManager {

	private static Map<Long, FacultyDiscipline> datasource = new HashMap<Long, FacultyDiscipline>();
	
	@Override
	public FacultyDiscipline insert(FacultyDiscipline entity) {

		Set<Long> idSet = datasource.keySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
		
		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public FacultyDiscipline select(Long id) {
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
	public List<FacultyDiscipline> selectAll() {
		List<FacultyDiscipline> allData = (List<FacultyDiscipline>) datasource.values();
		return allData;
	}

}
