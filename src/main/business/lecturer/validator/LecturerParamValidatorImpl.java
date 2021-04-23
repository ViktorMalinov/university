package main.business.lecturer.validator;

import main.dataaccess.apiuser.ApiUser;
import main.dataaccess.apiuser.ApiUserDao;
import main.dataaccess.apiuser.ApiUserDaoHMapImpl;
import main.dataaccess.department.Department;
import main.dataaccess.department.DepartmentDao;
import main.dataaccess.department.DepartmentDaoHMapImpl;
import main.service.lecturer.LecturerParam;

public class LecturerParamValidatorImpl implements LecturerParamValidator {

	private ApiUserDao apiUserDao = new ApiUserDaoHMapImpl();
	private DepartmentDao departmentDao = new DepartmentDaoHMapImpl(); 
	
	@Override
	public void validate(LecturerParam param) throws Exception {

		if (param == null) {
			throw new Exception( "ApiGroupUser param object you want to manipulate was not found!" );
		}
		
		if (param.getApiUserId() == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}		

		if (param.getDepartmentId() == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}		

		Department department = departmentDao.get(param.getDepartmentId());
		ApiUser apiUser = apiUserDao.get(param.getApiUserId());
		
		if (department == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}
		
		if (apiUser == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}

	}

}
