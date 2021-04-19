package main.business.lecturer.transformer;

import main.dataaccess.lecturer.Lecturer;
import main.service.lecturer.LecturerParam;

public class LecturerParamTransformerImpl implements LecturerParamTransformer {

	@Override
	public Lecturer transform(LecturerParam param) {
		Lecturer entity = new Lecturer();	
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		entity.setFamilyName(param.getFamilyName());
		entity.setApiUserId(param.getApiUserId());
		entity.setDepartmentId(param.getDepartmentId());
		
		return entity;
	}

}
