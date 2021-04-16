package main.business.department.processor;

import main.service.department.DepartmentParam;
import main.service.department.DepartmentResult;

public interface DepartmentProcessor {

	DepartmentResult create(DepartmentParam param);
	DepartmentResult get(Long id);
	void update(DepartmentParam param);
	void delete(Long id);
}
