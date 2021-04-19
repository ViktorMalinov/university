package main.business.lecturer.transformer;

import main.dataaccess.lecturer.Lecturer;
import main.service.lecturer.LecturerResult;

public class LecturerResultTransformerImpl implements LecturerResultTransformer {

	@Override
	public LecturerResult transform(Lecturer entity) {
		LecturerResult result = new LecturerResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		
		result.setFamilyName(entity.getFamilyName());
		result.setApiUserId(entity.getApiUserId());
		result.setDepartmentId(entity.getDepartmentId());
		
		return result;
	}

}
