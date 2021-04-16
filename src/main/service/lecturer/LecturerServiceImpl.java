package main.service.lecturer;

import main.business.lecturer.processor.LecturerProcessor;
import main.business.lecturer.processor.LecturerProcessorImpl;

public class LecturerServiceImpl implements LecturerService {

	private LecturerProcessor processor = new LecturerProcessorImpl();
	
	
	@Override
	public LecturerResult create(LecturerParam param) {
		LecturerResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public LecturerResult get(Long id) {
		LecturerResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(LecturerParam param) {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}
}
