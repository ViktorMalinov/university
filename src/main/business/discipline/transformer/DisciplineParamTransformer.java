package main.business.discipline.transformer;

import main.dataaccess.discipline.Discipline;
import main.service.discipline.DisciplineParam;

public interface DisciplineParamTransformer {

	Discipline transform(DisciplineParam obj);
}
