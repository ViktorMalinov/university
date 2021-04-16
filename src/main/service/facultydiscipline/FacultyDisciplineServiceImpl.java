package main.service.facultydiscipline;

import main.business.facultydiscipline.processor.FacultyDisciplineProcessor;
import main.business.facultydiscipline.processor.FacultyDisciplineProcessorImpl;

public class FacultyDisciplineServiceImpl implements FacultyDisciplineService {

	private FacultyDisciplineProcessor processor = new FacultyDisciplineProcessorImpl();
	
	
	@Override
	public FacultyDisciplineResult create(FacultyDisciplineParam param) {
		FacultyDisciplineResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public FacultyDisciplineResult get(Long id) {
		FacultyDisciplineResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(FacultyDisciplineParam param) {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}
	

}
