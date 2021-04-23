package main.business.discipline.processor;

import main.service.discipline.DisciplineParam;
import main.service.discipline.DisciplineResult;

public interface DisciplineProcessor {

	DisciplineResult create(DisciplineParam param) throws Exception;
	DisciplineResult get(Long id) throws Exception;
	void update(DisciplineParam param) throws Exception;
	void delete(Long id);
	
}
