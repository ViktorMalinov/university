package main.business.facultydiscipline.transformer;

import main.business.common.BaseParamValidatorImpl;
import main.business.facultydiscipline.validator.FacultyDisciplineParamValidatorImpl;
import main.dataaccess.discipline.dao.Discipline;
import main.dataaccess.discipline.dao.DisciplineDao;
import main.dataaccess.discipline.dao.DisciplineDaoHMapImpl;
import main.dataaccess.faculty.dao.Faculty;
import main.dataaccess.faculty.dao.FacultyDao;
import main.dataaccess.faculty.dao.FacultyDaoHMapImpl;
import main.dataaccess.facultydiscipline.dao.FacultyDiscipline;
import main.service.facultydiscipline.FacultyDisciplineParam;

public class FacultyDisciplineParamTransformerImpl implements FacultyDisciplineParamTransformer {

	private FacultyDao facultyDao = new FacultyDaoHMapImpl();
	private DisciplineDao disciplineDao = new DisciplineDaoHMapImpl();
	private BaseParamValidatorImpl <FacultyDisciplineParam> validator = new FacultyDisciplineParamValidatorImpl();
	
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
