package main.business.department.transformer;

import main.dataaccess.department.Department;
import main.service.department.DepartmentParam;

public class DepartmentParamTransformerImpl implements DepartmentParamTransformer {

	@Override
	public Department transform(DepartmentParam param) {
		Department entity = new Department();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		entity.setFacultyId(param.getFacultyId());
		
		return entity;
	}

}
