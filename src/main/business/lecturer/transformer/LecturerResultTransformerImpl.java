package main.business.lecturer.transformer;

import main.dataaccess.lecturer.Lecturer;
import main.service.lecturer.LecturerResult;

public class LecturerResultTransformerImpl implements LecturerResultTransformer {

	@Override
	public LecturerResult transform(Lecturer obj) {
		LecturerResult res = new LecturerResult();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		res.setFamilyName(obj.getFamilyName());
		res.setApiUserId(obj.getApiUserId());
		res.setDepartmentId(obj.getDepartmentId());
		
		return res;
	}

}
