package main.business.department.transformer;

import main.dataaccess.department.dao.Department;
import main.service.department.DepartmentResult;

public interface DepartmentResultTransformer {

	DepartmentResult transform(Department entity) throws Exception;
}
