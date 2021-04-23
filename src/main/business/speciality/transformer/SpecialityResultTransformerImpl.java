package main.business.speciality.transformer;

import main.dataaccess.speciality.dao.Speciality;
import main.service.speciality.SpecialityResult;

public class SpecialityResultTransformerImpl implements SpecialityResultTransformer {

	@Override
	public SpecialityResult transform(Speciality entity) throws Exception {
		SpecialityResult result = new SpecialityResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		
		
		if (entity.getFaculty() == null) {
			throw new Exception("The object Faculty was NOT found!");
		}
		
		if (entity.getFaculty().getName().isEmpty()) {
			throw new Exception("The Faculty NAME is empty!");
		}

		result.setFacultyId(entity.getFaculty().getId());
		result.setFacultyName(entity.getFaculty().getName());
		
		return result;
	}

}
