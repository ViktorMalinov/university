package main.business.department.processor;

import main.service.department.DepartmentParam;
import main.service.department.DepartmentResult;

public interface DepartmentProcessor {

	DepartmentResult create(DepartmentParam param) throws Exception;
	DepartmentResult get(Long id) throws Exception;
	void update(DepartmentParam param) throws Exception;
	void delete(Long id);
}
