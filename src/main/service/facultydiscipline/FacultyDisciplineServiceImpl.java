package main.service.facultydiscipline;

import main.business.facultydiscipline.processor.FacultyDisciplineProcessor;
import main.business.facultydiscipline.processor.FacultyDisciplineProcessorImpl;

public class FacultyDisciplineServiceImpl implements FacultyDisciplineService {

	private FacultyDisciplineProcessor processor = new FacultyDisciplineProcessorImpl();
	
	
	@Override
	public FacultyDisciplineResult create(FacultyDisciplineParam param) throws Exception {
		FacultyDisciplineResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public FacultyDisciplineResult get(Long id) throws Exception {
		FacultyDisciplineResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(FacultyDisciplineParam param) throws Exception {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}
	

}
