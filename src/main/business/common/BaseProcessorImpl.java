package main.business.common;

import main.dataaccess.common.BaseDao;
import main.dataaccess.common.NamePersistent;
import main.service.common.NameDto;

public class BaseProcessorImpl<
		IN  extends NameDto,
		OUT extends NameDto,
		ENT extends NamePersistent,
		DAO extends BaseDao<PK, ENT>,
		PTR extends BaseParamTransformer<IN, ENT>,
		RTR extends BaseResultTransformer<OUT, ENT>,
		PK > 
		implements BaseProcessor<IN, OUT, PK> {


	protected DAO dao;
	protected PTR paramTransformer;
	protected RTR resultTransformer;
	
	
	@Override
	public OUT create(IN param) throws Exception {
		ENT entity = paramTransformer.transform(param); 
		
		entity = dao.create(entity);
		
		OUT result = resultTransformer.transform(entity);
		return result;	
	}

	@Override
	public OUT get(PK id) throws Exception {
		ENT entity = dao.get(id);
		OUT result = resultTransformer.transform(entity);
		return result;
	}

	@Override
	public void update(IN param) throws Exception {
		ENT entity = paramTransformer.transform(param);
		dao.update(entity);
	}

	@Override
	public void delete(PK id) {
		dao.delete(id);
	}
	
	
}
