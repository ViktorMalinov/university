package main.business.discipline.transformer;

import main.dataaccess.discipline.dao.Discipline;
import main.service.discipline.DisciplineResult;

public interface DisciplineResultTransformer {

	DisciplineResult transform(Discipline entity);
}
