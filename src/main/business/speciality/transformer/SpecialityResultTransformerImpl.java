package main.business.speciality.transformer;

import main.dataaccess.speciality.Speciality;
import main.service.speciality.SpecialityResult;

public class SpecialityResultTransformerImpl implements SpecialityResultTransformer {

	@Override
	public SpecialityResult transform(Speciality obj) {
		SpecialityResult res = new SpecialityResult();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
