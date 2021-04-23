package main.business.speciality.transformer;

import main.business.speciality.validator.SpecialityParamValidator;
import main.business.speciality.validator.SpecialityParamValidatorImpl;
import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.dataaccess.speciality.dao.Speciality;
import main.service.speciality.SpecialityParam;

public class SpecialityParamTransformerImpl implements SpecialityParamTransformer {

	private FacultyDao dao = new FacultyDaoHMapImpl();
	private SpecialityParamValidator validator = new SpecialityParamValidatorImpl();
	
	@Override
	public Speciality transform(SpecialityParam param) throws Exception {
		
		validator.validate(param);
		
		Speciality entity = new Speciality();
		
		entity.setId(param.getId());
		entity.setCode(param.getCode());
		entity.setName(param.getName());
		entity.setDescription(param.getDescription());
		
		Faculty faculty = dao.get(param.getFacultyId()); // ---
		entity.setFaculty(faculty); // ---		

		return entity;
	}

	
	public FacultyDao getDao() {
		return dao;
	}

	public void setDao(FacultyDao dao) {
		this.dao = dao;
	}

}
