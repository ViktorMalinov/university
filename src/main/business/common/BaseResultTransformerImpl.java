package main.business.common;

import main.dataaccess.common.NamePersistent;
import main.service.common.NameDto;

public abstract class BaseResultTransformerImpl<
		OUT extends NameDto,
		ENT extends NamePersistent> implements BaseResultTransformer<OUT, ENT> {

	protected abstract OUT getNewResult();
	protected void setProperties(ENT entity, OUT result){
	}
	
	public OUT transform(ENT entity) throws Exception {
		
		OUT result = getNewResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		
		setProperties(entity, result);
		
		return result;
	}
}
