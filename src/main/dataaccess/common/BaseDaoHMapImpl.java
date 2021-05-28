package main.dataaccess.common;

import java.util.List;

public abstract class BaseDaoHMapImpl <PK, ENT> implements BaseDao <PK, ENT> {

	//private BaseRepoManager<PK, ENT> repo = new BaseRepoManager<PK, ENT>();
	
	public abstract BaseRepoManager<PK, ENT> getRepo();
	
	@Override
	public ENT create(ENT entity) {
		ENT res = getRepo().insert(entity);
		return res;
	}

	@Override
	public ENT get(PK id) {
		ENT entity = getRepo().select(id);
		return entity;	
	}

	@Override
	public void update(ENT entity) {
		getRepo().update(entity);
	}

	@Override
	public void delete(PK id) {
		getRepo().delete(id);

	}
	
	@Override
	public List<ENT> selectAll() {
		List<ENT> allData = getRepo().selectAll();
		return allData;
	}
	
	
}
