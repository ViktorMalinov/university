package main.business.lecturer.transformer;

import main.business.lecturer.validator.LecturerParamValidator;
import main.business.lecturer.validator.LecturerParamValidatorImpl;
import main.dataaccess.apiuser.dao.ApiUser;
import main.dataaccess.apiuser.dao.ApiUserDao;
import main.dataaccess.apiuser.dao.ApiUserDaoHMapImpl;
import main.dataaccess.department.dao.Department;
import main.dataaccess.department.dao.DepartmentDao;
import main.dataaccess.department.dao.DepartmentDaoHMapImpl;
import main.dataaccess.lecturer.dao.Lecturer;
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
