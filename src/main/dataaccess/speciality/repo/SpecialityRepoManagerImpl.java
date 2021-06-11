package main.dataaccess.speciality.repo;

import java.util.HashMap;
import java.util.Map;

import main.dataaccess.common.PersistentRepoManagerImpl;
import main.dataaccess.speciality.dao.Speciality;

public class SpecialityRepoManagerImpl extends PersistentRepoManagerImpl<Speciality> implements SpecialityRepoManager {

	private static Map<Long, Speciality> datasource = new HashMap<Long, Speciality>();

	@Override
	public Map<Long, Speciality> getDataSource() {
		return datasource;
	}
	
	
	public String getPath() {
		return "D:\\workspace\\Java\\Test\\University\\resources\\Speciality.json";
	}
	

	@Override
	public Class<?> getClazz() {
		return Speciality.class;
	}

	public SpecialityRepoManagerImpl() {
		load();
	}
}
