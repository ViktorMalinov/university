package main.dataaccess.discipline.repo;

import java.util.HashMap;
import java.util.Map;

import main.dataaccess.common.PersistentRepoManagerImpl;
import main.dataaccess.discipline.dao.Discipline;

public class DisciplineRepoManagerImpl extends PersistentRepoManagerImpl<Discipline> implements DisciplineRepoManager {

	private static Map<Long, Discipline> datasource = new HashMap<Long, Discipline>();

	@Override
	public Map<Long, Discipline> getDataSource() {
		return datasource;
	}

}
