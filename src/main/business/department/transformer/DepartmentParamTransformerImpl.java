package main.business.department.transformer;

import main.dataaccess.department.Department;
import main.service.department.DepartmentParam;

public class DepartmentParamTransformerImpl implements DepartmentParamTransformer {

	@Override
	public Department transform(DepartmentParam obj) {
		Department res = new Department();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		res.setFacultyId(obj.getFacultyId());
		
		return res;
	}

}
