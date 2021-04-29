package main.dataaccess.common;

import java.util.Set;

import main.common.Utils;

public class PersistentRepoManagerImpl<ENT extends Persistent> extends BaseRepoManagerImpl<Long, ENT> 
		implements BaseRepoManager<Long, ENT> {

	@Override
	public Long getPk(ENT entity) {
		return entity.getId();
	}

	@Override
	public void setPk(ENT entity) {

		Set<Long> idSet = datasource.keySet();		// get all id's from db object
		Long id = Utils.getNextId(idSet); 	// get next id
		entity.setId(id);		
	}

}
