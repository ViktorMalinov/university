package main.business.lecturer.transformer;

import main.dataaccess.lecturer.dao.Lecturer;
import main.service.lecturer.LecturerResult;

public class LecturerResultTransformerImpl implements LecturerResultTransformer {

	@Override
	public LecturerResult transform(Lecturer entity) throws Exception {
		LecturerResult result = new LecturerResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		
		result.setFamilyName(entity.getFamilyName());
		
		
		if (entity.getDepartment() == null) {
			throw new Exception("The object Department was NOT found!");
		}
		
		if (entity.getDepartment().getName().isEmpty()) {
			throw new Exception("The Department NAME is empty!");
		}
		
		if (entity.getApiUser() == null) {
			throw new Exception("The object API User was NOT found!");
		}
		
		if (entity.getApiUser().getDisplayName().isEmpty()) {
			throw new Exception("The API user display NAME is empty!");
		}
		
		result.setDepartmentId(entity.getDepartment().getId());
		result.setDepartmentName(entity.getDepartment().getName());
		
		result.setApiUserId(entity.getApiUser().getId());
		result.setApiUserDisplayName(entity.getApiUser().getDisplayName());
		
		return result;
	}

}
