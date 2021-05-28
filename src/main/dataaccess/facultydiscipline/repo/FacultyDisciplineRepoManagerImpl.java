package main.dataaccess.facultydiscipline.repo;

import java.util.HashMap;
import java.util.Map;

import main.dataaccess.common.PersistentRepoManagerImpl;
import main.dataaccess.facultydiscipline.dao.FacultyDiscipline;

public class FacultyDisciplineRepoManagerImpl extends PersistentRepoManagerImpl<FacultyDiscipline> implements FacultyDisciplineRepoManager {

	private static Map<Long, FacultyDiscipline> datasource = new HashMap<Long, FacultyDiscipline>();

	@Override
	public Map<Long, FacultyDiscipline> getDataSource() {
		return datasource;
	}

}
