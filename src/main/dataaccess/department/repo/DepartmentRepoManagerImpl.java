package main.dataaccess.department.repo;

import java.util.HashMap;
import java.util.Map;

import main.dataaccess.common.PersistentRepoManagerImpl;
import main.dataaccess.department.dao.Department;

public class DepartmentRepoManagerImpl extends PersistentRepoManagerImpl<Department> implements DepartmentRepoManager {

	private static Map<Long, Department> datasource = new HashMap<Long, Department>();
	
	public String getPath() {
		return "D:\\workspace\\Java\\Test\\University\\resources\\Department.json";
	}
	
	
	@Override
	public Map<Long, Department> getDataSource() {
		return datasource;
	}

	

}
