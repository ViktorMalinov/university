package main.business.discipline.transformer;

import main.dataaccess.discipline.dao.Discipline;
import main.service.discipline.DisciplineParam;

public interface DisciplineParamTransformer {

	Discipline transform(DisciplineParam param) throws Exception;
}
