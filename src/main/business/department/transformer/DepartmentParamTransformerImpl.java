package main.business.department.transformer;

import main.dataaccess.department.Department;
import main.dataaccess.faculty.Faculty;
import main.dataaccess.faculty.FacultyDao;
import main.dataaccess.faculty.FacultyDaoHMapImpl;
import main.service.department.DepartmentParam;

public class DepartmentParamTransformerImpl implements DepartmentParamTransformer {

	@Override
	public Department transform(DepartmentParam param) {
		Department entity = new Department();
		FacultyDao dao = new FacultyDaoHMapImpl();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		try {
			if (param.getFacultyId() == null) {
				throw new Exception("The Faculty ID was NOT found!");
			}
		
			Faculty fResult = dao.get(param.getFacultyId()); // ---
			
			if (fResult == null) {
				throw new Exception("The Faculty DAO was NOT found!");
			}
		
			entity.setFaculty(fResult); // ---
		
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		return entity;
	}

}
