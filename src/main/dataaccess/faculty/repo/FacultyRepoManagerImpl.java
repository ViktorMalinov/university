package main.dataaccess.faculty.repo;

import java.util.HashMap;
import java.util.Map;

import main.dataaccess.common.PersistentRepoManagerImpl;
import main.dataaccess.faculty.dao.Faculty;

public class FacultyRepoManagerImpl extends PersistentRepoManagerImpl<Faculty> implements FacultyRepoManager {

	private static Map<Long, Faculty> datasource = new HashMap<Long, Faculty>();

	@Override
	public Map<Long, Faculty> getDataSource() {
		return datasource;
	}
	
	
	public String getPath() {
		return "D:\\workspace\\Java\\Test\\University\\resources\\Faculty.json";
	}
	
	@Override
	public Class<?> getClazz() {
		return Faculty.class;
	}

	public FacultyRepoManagerImpl() {
		load();
	}
}
