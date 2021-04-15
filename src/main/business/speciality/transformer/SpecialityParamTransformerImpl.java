package main.business.speciality.transformer;

import main.dataaccess.speciality.Speciality;
import main.service.speciality.SpecialityParam;

public class SpecialityParamTransformerImpl implements SpecialityParamTransformer {

	@Override
	public Speciality transform(SpecialityParam obj) {
		Speciality res = new Speciality();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
