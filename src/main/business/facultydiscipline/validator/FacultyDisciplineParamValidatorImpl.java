package main.business.facultydiscipline.validator;

import main.dataaccess.discipline.Discipline;
import main.dataaccess.discipline.DisciplineDao;
import main.dataaccess.discipline.DisciplineDaoHMapImpl;
import main.dataaccess.faculty.Faculty;
import main.dataaccess.faculty.FacultyDao;
import main.dataaccess.faculty.FacultyDaoHMapImpl;
import main.service.facultydiscipline.FacultyDisciplineParam;

public class FacultyDisciplineParamValidatorImpl implements FacultyDisciplineParamValidator {

	private FacultyDao facultyDao = new FacultyDaoHMapImpl();
	private DisciplineDao disciplineDao = new DisciplineDaoHMapImpl(); 
	
	@Override
	public void validate(FacultyDisciplineParam param) throws Exception {
		
		if (param == null) {
			throw new Exception( "FacultyDiscipline param object you want to manipulate was not found!" );
		}
		
		if (param.getDisciplineId() == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}		

		if (param.getFacultyId() == null) {
			throw new Exception("The object you want to manipulate was not found!");
		}		

		Discipline discipline = disciplineDao.get(param.getDisciplineId());
		Faculty faculty = facultyDao.get(param.getFacultyId());
		
		if (discipline == null) {
			throw new Exception("The Deiscipline DAO was NOT found!");
		}
		
		if (faculty == null) {
			throw new Exception("The Faculty DAO was NOT found!");
		}
		

	}

}
