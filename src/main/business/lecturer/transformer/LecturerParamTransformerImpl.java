package main.business.lecturer.transformer;

import main.dataaccess.lecturer.Lecturer;
import main.service.lecturer.LecturerParam;

public class LecturerParamTransformerImpl implements LecturerParamTransformer {

	@Override
	public Lecturer transform(LecturerParam obj) {
		Lecturer res = new Lecturer();	
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
