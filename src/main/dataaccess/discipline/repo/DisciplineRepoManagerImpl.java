package main.dataaccess.discipline.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.common.Utils;
import main.dataaccess.discipline.dao.Discipline;

public class DisciplineRepoManagerImpl implements DisciplineRepoManager {

	private static Map<Long, Discipline> datasource = new HashMap<Long, Discipline>();
	
	@Override
	public Discipline insert(Discipline entity) {

		Set<Long> idSet = datasource.keySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		

		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Discipline select(Long id) {
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
	public List<Discipline> selectAll() {
		List<Discipline> allData = (List<Discipline>) datasource.values();
		return allData;
	}

}
