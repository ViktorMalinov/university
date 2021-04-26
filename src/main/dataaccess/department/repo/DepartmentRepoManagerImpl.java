package main.dataaccess.department.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.common.Utils;
import main.dataaccess.department.dao.Department;

public class DepartmentRepoManagerImpl implements DepartmentRepoManager {

	private static Map<Long, Department> datasource = new HashMap<Long, Department>();
	
	@Override
	public Department insert(Department entity) {
		
		Set<Long> idSet = datasource.keySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		

		datasource.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Department select(Long id) {
		Department entity = datasource.get(id);
		return entity;	
	}

	@Override
	public void update(Department entity) {
		datasource.put(entity.getId(), entity);

	}

	@Override
	public void delete(Long id) {
		datasource.remove(id);

	}

	@Override
	public List<Department> selectAll() {
		List<Department> allData = (List<Department>) datasource.values();
		return allData;
	}

}
