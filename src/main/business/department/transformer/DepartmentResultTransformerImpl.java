package main.business.department.transformer;

import main.dataaccess.department.Department;
import main.service.department.DepartmentResult;

public class DepartmentResultTransformerImpl implements DepartmentResultTransformer {

	@Override
	public DepartmentResult transform(Department entity) throws Exception {
		DepartmentResult result = new DepartmentResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		
		
		if (entity.getFaculty() == null) {
			throw new Exception("The object Faculty was NOT found!");
		}
		
		if (entity.getFaculty().getName().isEmpty()) {
			throw new Exception("The Faculty NAME is empty!");
		}
			
		
		result.setFacultyId(entity.getFaculty().getId());
		result.setFacultyName(entity.getFaculty().getName());
		
		return result;
	}

}
