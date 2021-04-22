package main.business.department.transformer;

import main.business.department.validator.BusinessDepartmentValidatorImpl;
import main.common.Validator;
import main.dataaccess.department.Department;
import main.dataaccess.faculty.Faculty;
import main.service.department.DepartmentResult;

public class DepartmentResultTransformerImpl implements DepartmentResultTransformer {

	private Validator<Faculty> validateFaculty = new  BusinessDepartmentValidatorImpl<Faculty>();
	private Validator<String> validateString = new  BusinessDepartmentValidatorImpl<String>();
	
	@Override
	public DepartmentResult transform(Department entity) throws Exception {
		DepartmentResult result = new DepartmentResult();
		
		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setName(entity.getName());
		result.setDescription(entity.getDescription());
		
		
		validateFaculty.validate(entity.getFaculty(), "The object Faculty was NOT found!");
		validateString.validate(entity.getFaculty().getName(), "The Faculty NAME is empty!");
		
		
		result.setFacultyId(entity.getFaculty().getId());
		result.setFacultyName(entity.getFaculty().getName());
		
		return result;
	}

}
