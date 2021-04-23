package main.business.facultydiscipline.transformer;

import main.business.facultydiscipline.validator.FacultyDisciplineParamValidator;
import main.business.facultydiscipline.validator.FacultyDisciplineParamValidatorImpl;
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
	private FacultyDisciplineParamValidator validator = new FacultyDisciplineParamValidatorImpl();
	
	@Override
	public FacultyDiscipline transform(FacultyDisciplineParam param) throws Exception {

		validator.validate(param);
		
		FacultyDiscipline entity = new FacultyDiscipline();
		
		Discipline discipline = disciplineDao.get(param.getDisciplineId());
		Faculty faculty = facultyDao.get(param.getFacultyId());
		
		entity.setId(param.getId());
		entity.setDiscipline(discipline);
		entity.setFaculty(faculty);
		
		return entity;
	}

}
