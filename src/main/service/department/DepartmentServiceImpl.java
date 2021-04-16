package main.service.department;

import main.business.department.processor.DepartmentProcessor;
import main.business.department.processor.DepartmentProcessorImpl;

public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentProcessor processor = new DepartmentProcessorImpl();
	
	
	@Override
	public DepartmentResult create(DepartmentParam param) {
		DepartmentResult result = processor.create(param);
		return result;
	}
	
	
	@Override
	public DepartmentResult get(Long id) {
		DepartmentResult result = processor.get(id);
		return result;
	}
	
	
	@Override
	public void update(DepartmentParam param) {
		processor.update(param);
	}
	
	
	@Override
	public void delete(Long id) {
		processor.delete(id);
	}
	
}
