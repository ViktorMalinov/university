package main.business.common;

import main.dataaccess.common.NamePersistent;
import main.service.common.NameDto;

public abstract class BaseParamTransformerImpl<
		IN extends NameDto, 
		ENT extends NamePersistent, 
		VAL extends BaseParamValidatorImpl<IN> > implements BaseParamTransformer<IN, ENT> {

	protected VAL validator;
	
	protected abstract ENT getNewEntity(); 
	protected void setProperties(ENT entity, IN param){
	}
	
	
	@Override
	public ENT transform(IN param) throws Exception {

		validator.validate(param);

		ENT entity = getNewEntity();
	
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		setProperties(entity,param);
		
			
		return entity;
	}
}
