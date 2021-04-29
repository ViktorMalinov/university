package main.dataaccess.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseRepoManagerImpl<PK, ENT> implements BaseRepoManager<PK, ENT> {

	protected Map<PK, ENT> datasource = new HashMap<PK, ENT>();
	
	
	public abstract PK getPk(ENT entity);
	public abstract void setPk(ENT entity);
	
	
	@Override
	public ENT insert(ENT entity) {
		
		/*
		Set<Pk> idSet = datasource.keySet();		// get all id's from db object
		Pk id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		

		datasource.put(entity.getId(), entity);
		*/
		
		setPk(entity);
		datasource.put(getPk(entity), entity);
		
		return entity;
	}

	@Override
	public ENT select(PK id) {
		ENT entity = datasource.get(id);
		return entity;	
	}

	@Override
	public void update(ENT entity) {
		datasource.put(getPk(entity), entity);

	}

	@Override
	public void delete(PK id) {
		datasource.remove(id);

	}

	@Override
	public List<ENT> selectAll() {
		List<ENT> allData = (List<ENT>) datasource.values();
		return allData;
	}

}
