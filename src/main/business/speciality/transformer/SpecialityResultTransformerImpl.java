package main.business.speciality.transformer;

import main.dataaccess.speciality.Speciality;
import main.service.speciality.SpecialityResult;

public class SpecialityResultTransformerImpl implements SpecialityResultTransformer {

	@Override
	public SpecialityResult transform(Speciality entity) {
		SpecialityResult result = new SpecialityResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		
		result.setFacultyId(entity.getFacultyId());

		return result;
	}

}
