package main.business.department.transformer;

import main.dataaccess.department.Department;
import main.service.department.DepartmentResult;

public interface DepartmentResultTransformer {

	DepartmentResult transform(Department obj);
}
