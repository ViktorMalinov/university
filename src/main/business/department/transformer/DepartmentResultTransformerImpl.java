package main.business.department.transformer;

import main.dataaccess.department.Department;
import main.service.department.DepartmentResult;

public class DepartmentResultTransformerImpl implements DepartmentResultTransformer {

	@Override
	public DepartmentResult transform(Department obj) {
		DepartmentResult res = new DepartmentResult();
		
		res.setId(obj.getId());
		res.setCode(obj.getCode());
		res.setName(obj.getName());
		res.setDescription(obj.getDescription());
		
		return res;
	}

}
