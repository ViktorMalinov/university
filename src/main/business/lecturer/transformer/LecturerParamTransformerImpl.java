package main.business.lecturer.transformer;

import main.business.lecturer.validator.LecturerParamValidator;
import main.business.lecturer.validator.LecturerParamValidatorImpl;
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
	private LecturerParamValidator validator = new LecturerParamValidatorImpl();
	
	@Override
	public Lecturer transform(LecturerParam param) throws Exception {

		validator.validate(param);
		
		Lecturer entity = new Lecturer();	
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		entity.setFamilyName(param.getFamilyName());

		Department department = departmentDao.get(param.getDepartmentId());
		ApiUser apiUser = apiUserDao.get(param.getApiUserId());
		
		entity.setApiUser(apiUser);
		entity.setDepartment(department);
		
		return entity;
	}

}
