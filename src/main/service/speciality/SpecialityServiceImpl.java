package main.service.speciality;

import main.business.speciality.processor.SpecialityProcessor;
import main.business.speciality.processor.SpecialityProcessorImpl;

public class SpecialityServiceImpl implements SpecialityService {

	private SpecialityProcessor processor = new SpecialityProcessorImpl();
	
	
	@Override
	public SpecialityResult create(SpecialityParam param) {
		SpecialityResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public SpecialityResult get(Long id) {
		SpecialityResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(SpecialityParam param) {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}
	
}
