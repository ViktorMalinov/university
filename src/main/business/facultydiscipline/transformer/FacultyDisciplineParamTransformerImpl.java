package main.business.facultydiscipline.transformer;

import main.dataaccess.discipline.Discipline;
import main.dataaccess.discipline.DisciplineDao;
import main.dataaccess.discipline.DisciplineDaoHMapImpl;
import main.dataaccess.faculty.Faculty;
import main.dataaccess.faculty.FacultyDao;
import main.dataaccess.faculty.FacultyDaoHMapImpl;
import main.dataaccess.facultydiscipline.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineParam;

public class FacultyDisciplineParamTransformerImpl implements FacultyDisciplineParamTransformer {

	private FacultyDao facultyDao = new FacultyDaoHMapImpl();
	private DisciplineDao disciplineDao = new DisciplineDaoHMapImpl(); 
	
	@Override
	public FacultyDiscipline transform(FacultyDisciplineParam param) throws Exception {
		FacultyDiscipline entity = new FacultyDiscipline();
		
		entity.setId(param.getId());
		
		if (param.getDisciplineId() == null) {
			throw new Exception("The Discpline ID was NOT found!");
		}		

		if (param.getFacultyId() == null) {
			throw new Exception("The Faculty ID was NOT found!");
		}		

		Discipline discipline = disciplineDao.get(param.getDisciplineId());
		Faculty faculty = facultyDao.get(param.getFacultyId());
		
		if (discipline == null) {
			throw new Exception("The Deiscipline DAO was NOT found!");
		}
		
		if (faculty == null) {
			throw new Exception("The Faculty DAO was NOT found!");
		}

		
		entity.setDiscipline(discipline);
		entity.setFaculty(faculty);
		
		return entity;
	}

}
