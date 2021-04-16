package main.business.discipline.processor;

import main.service.discipline.DisciplineParam;
import main.service.discipline.DisciplineResult;

public interface DisciplineProcessor {

	DisciplineResult create(DisciplineParam param);
	DisciplineResult get(Long id);
	void update(DisciplineParam param);
	void delete(Long id);
	
}
