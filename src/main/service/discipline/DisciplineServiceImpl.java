package main.service.discipline;

import main.business.discipline.processor.DisciplineProcessor;
import main.business.discipline.processor.DisciplineProcessorImpl;

public class DisciplineServiceImpl implements DisciplineService {

	private DisciplineProcessor processor = new DisciplineProcessorImpl();
	
	
	@Override
	public DisciplineResult create(DisciplineParam param) throws Exception {
		DisciplineResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public DisciplineResult get(Long id) throws Exception {
		DisciplineResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(DisciplineParam param) throws Exception {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}
	


}
