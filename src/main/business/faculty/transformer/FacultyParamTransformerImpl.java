package main.business.faculty.transformer;

import main.dataaccess.faculty.Faculty;
import main.service.faculty.FacultyParam;

public class FacultyParamTransformerImpl implements FacultyParamTransformer {

	@Override
	public Faculty transform(FacultyParam obj) {
		Faculty res = new Faculty();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
