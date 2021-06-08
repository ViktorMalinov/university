package main.dataaccess.common;

import java.util.List;
import java.util.Map;

public abstract class BaseRepoManagerImpl<PK, ENT> implements BaseRepoManager<PK, ENT> {

	
	public abstract PK getPk(ENT entity);
	public abstract void setPk(ENT entity);
	public abstract Map<PK, ENT> getDataSource();
	
	
	@Override
	public ENT insert(ENT entity) {
		setPk(entity);
		getDataSource().put(getPk(entity), entity);
		
		return entity;
	}

	@Override
	public ENT select(PK id) {
		ENT entity = getDataSource().get(id);
		return entity;	
	}

	@Override
	public void update(ENT entity) {
		getDataSource().put(getPk(entity), entity);

	}

	@Override
	public void delete(PK id) {
		getDataSource().remove(id);

	}

	@Override
	public List<ENT> selectAll() {
		List<ENT> allData = (List<ENT>) getDataSource().values();
		return allData;
	}

}
