package main.business.faculty.transformer;

import main.dataaccess.faculty.Faculty;
import main.service.faculty.FacultyResult;

public class FacultyResultTransformerImpl implements FacultyResultTransformer {

	@Override
	public FacultyResult transform(Faculty entity) {
		FacultyResult result = new FacultyResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		
		return result;
	}

}
