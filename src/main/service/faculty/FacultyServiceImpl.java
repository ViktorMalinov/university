package main.service.faculty;

import main.business.faculty.processor.FacultyProcessor;
import main.business.faculty.processor.FacultyProcessorImpl;

public class FacultyServiceImpl implements FacultyService {

	private FacultyProcessor processor = new FacultyProcessorImpl();
	
	
	@Override
	public FacultyResult create(FacultyParam param) {
		FacultyResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public FacultyResult get(Long id) {
		FacultyResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(FacultyParam param) {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}

}
