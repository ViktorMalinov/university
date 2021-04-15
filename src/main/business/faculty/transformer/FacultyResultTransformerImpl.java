package main.business.faculty.transformer;

import main.dataaccess.faculty.Faculty;
import main.service.faculty.FacultyResult;

public class FacultyResultTransformerImpl implements FacultyResultTransformer {

	@Override
	public FacultyResult transform(Faculty obj) {
		FacultyResult res = new FacultyResult();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
