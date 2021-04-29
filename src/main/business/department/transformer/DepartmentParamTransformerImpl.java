package main.business.department.transformer;

import main.business.department.validator.DepartmentParamValidator;
import main.business.department.validator.DepartmentParamValidatorImpl;
import main.dataaccess.department.dao.Department;
import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.service.department.DepartmentParam;

public class DepartmentParamTransformerImpl implements DepartmentParamTransformer {

	private FacultyDao dao = new FacultyDaoHMapImpl();
	
	private DepartmentParamValidator validator = new DepartmentParamValidatorImpl();
	
	@Override
	public Department transform(DepartmentParam param) throws Exception {

		validator.validate(param);

		Department entity = new Department();
	
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		Faculty fResult = dao.get(param.getFacultyId()); 
		entity.setFaculty(fResult); 
		
			
		return entity;
	}

	public FacultyDao getDao() {
		return dao;
	}

	public void setDao(FacultyDao dao) {
		this.dao = dao;
	}

}
