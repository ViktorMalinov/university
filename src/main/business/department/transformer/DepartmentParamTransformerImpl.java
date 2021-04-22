package main.business.department.transformer;

import main.business.department.validator.BusinessDepartmentValidatorImpl;
import main.common.Validator;
import main.dataaccess.department.Department;
import main.dataaccess.faculty.Faculty;
import main.dataaccess.faculty.FacultyDao;
import main.dataaccess.faculty.FacultyDaoHMapImpl;
import main.service.department.DepartmentParam;

public class DepartmentParamTransformerImpl implements DepartmentParamTransformer {

	private FacultyDao dao = new FacultyDaoHMapImpl();
	private Validator<Long> validateLong = new BusinessDepartmentValidatorImpl<Long>();
	private Validator<Faculty> validateFaculty = new BusinessDepartmentValidatorImpl<Faculty>();
	
	@Override
	public Department transform(DepartmentParam param) throws Exception {
		Department entity = new Department();
		
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		validateLong.validate(param.getFacultyId(), "The Faculty ID was NOT found!");
		Faculty fResult = dao.get(param.getFacultyId()); 
		
		validateFaculty.validate(fResult, "The Faculty DAO was NOT found!");
		entity.setFaculty(fResult); // ---
		
			
		return entity;
	}

	public FacultyDao getDao() {
		return dao;
	}

	public void setDao(FacultyDao dao) {
		this.dao = dao;
	}

}
