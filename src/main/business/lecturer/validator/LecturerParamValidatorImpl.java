package main.business.lecturer.validator;

import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.apiuser.dao.ApiUserDao;
import main.dataaccess.apiuser.dao.ApiUserDaoHMapImpl;
import main.dataaccess.department.dao.Department;
import main.dataaccess.department.dao.DepartmentDao;
import main.dataaccess.department.dao.DepartmentDaoHMapImpl;
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
