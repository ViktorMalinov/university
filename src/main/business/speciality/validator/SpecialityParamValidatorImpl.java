package main.business.speciality.validator;

import main.dataaccess.faculty.Faculty;
import main.dataaccess.faculty.FacultyDao;
import main.dataaccess.faculty.FacultyDaoHMapImpl;
import main.service.speciality.SpecialityParam;

public class SpecialityParamValidatorImpl implements SpecialityParamValidator {

	private FacultyDao dao = new FacultyDaoHMapImpl();
	
	@Override
	public void validate(SpecialityParam param) throws Exception {

		if (param == null) {
			throw new Exception( "Speciality param object you want to manipulate was not found!" );
		}

		if (param.getFacultyId() == null) {
			throw new Exception( "The object you want to manipulate was not found!" );
		}

		Faculty faculty = dao.get(param.getFacultyId());
		
		if (faculty == null) {
			throw new Exception( "The object you want to manipulate was not found!" );
		}
		
		
	}

}
