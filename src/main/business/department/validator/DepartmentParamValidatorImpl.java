package main.business.department.validator;

import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.service.department.DepartmentParam;

public class DepartmentParamValidatorImpl implements DepartmentParamValidator {

	private FacultyDao dao = new FacultyDaoHMapImpl(); 
	
	
	@Override
	public void validate(DepartmentParam param) throws Exception {

		if (param == null) {
			throw new Exception( "Department param object you want to manipulate was not found!" );
		}
		
		if (param.getFacultyId() == null) {
			throw new Exception( "The object you want to manipulate was not found!" );
		}

		Faculty fResult = dao.get(param.getFacultyId());
		
		if (fResult == null) {
			throw new Exception( "The object you want to manipulate was not found!" );
		}
		
	}

}
