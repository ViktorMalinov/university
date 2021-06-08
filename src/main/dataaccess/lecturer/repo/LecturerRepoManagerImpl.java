package main.dataaccess.lecturer.repo;

import java.util.HashMap;
import java.util.Map;

import main.dataaccess.common.PersistentRepoManagerImpl;
import main.dataaccess.lecturer.dao.Lecturer;

public class LecturerRepoManagerImpl extends PersistentRepoManagerImpl<Lecturer> implements LecturerRepoManager {

	private static Map<Long, Lecturer> datasource = new HashMap<Long, Lecturer>();

	@Override
	public Map<Long, Lecturer> getDataSource() {
		return datasource;
	}

	
	public String getPath() {
		return "D:\\workspace\\Java\\Test\\University\\resources\\Lecturer.json";
	}
	
}
