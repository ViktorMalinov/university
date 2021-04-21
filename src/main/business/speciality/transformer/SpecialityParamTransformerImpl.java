package main.business.speciality.transformer;

import main.dataaccess.faculty.Faculty;
import main.dataaccess.faculty.FacultyDao;
import main.dataaccess.faculty.FacultyDaoHMapImpl;
import main.dataaccess.speciality.Speciality;
import main.service.speciality.SpecialityParam;

public class SpecialityParamTransformerImpl implements SpecialityParamTransformer {

	private FacultyDao dao = new FacultyDaoHMapImpl();
	
	@Override
	public Speciality transform(SpecialityParam param) throws Exception {
		Speciality entity = new Speciality();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		if (param.getFacultyId() == null) {
			throw new Exception("The Faculty ID was NOT found!");
		}

		Faculty fResult = dao.get(param.getFacultyId()); // ---
			
		if (fResult == null) {
			throw new Exception("The Faculty DAO was NOT found!");
		}

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
