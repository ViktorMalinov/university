package main.business.lecturer.transformer;

import main.dataaccess.apiuser.ApiUser;
import main.dataaccess.apiuser.ApiUserDao;
import main.dataaccess.apiuser.ApiUserDaoHMapImpl;
import main.dataaccess.department.Department;
import main.dataaccess.department.DepartmentDao;
import main.dataaccess.department.DepartmentDaoHMapImpl;
import main.dataaccess.lecturer.Lecturer;
import main.service.lecturer.LecturerParam;

public class LecturerParamTransformerImpl implements LecturerParamTransformer {

	private ApiUserDao apiUserDao = new ApiUserDaoHMapImpl();
	private DepartmentDao departmentDao = new DepartmentDaoHMapImpl(); 
	
	@Override
	public Lecturer transform(LecturerParam param) throws Exception {
		Lecturer entity = new Lecturer();	
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		entity.setFamilyName(param.getFamilyName());
		
		if (param.getApiUserId() == null) {
			throw new Exception("The API user ID was NOT found!");
		}		

		if (param.getDepartmentId() == null) {
			throw new Exception("The Department ID was NOT found!");
		}		

		Department department = departmentDao.get(param.getDepartmentId());
		ApiUser apiUser = apiUserDao.get(param.getApiUserId());
		
		if (department == null) {
			throw new Exception("The Department DAO was NOT found!");
		}
		
		if (apiUser == null) {
			throw new Exception("The Department DAO was NOT found!");
		}
		
		entity.setApiUser(apiUser);
		entity.setDepartment(department);
		
		
		return entity;
	}

}
