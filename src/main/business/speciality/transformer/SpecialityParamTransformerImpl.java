package main.business.speciality.transformer;

import main.dataaccess.speciality.Speciality;
import main.service.speciality.SpecialityParam;

public class SpecialityParamTransformerImpl implements SpecialityParamTransformer {

	@Override
	public Speciality transform(SpecialityParam param) {
		Speciality entity = new Speciality();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		entity.setFacultyId(param.getFacultyId());
		
		return entity;
	}

}
