package main.business.department.transformer;

import main.dataaccess.department.dao.Department;
import main.service.department.DepartmentParam;

public interface DepartmentParamTransformer {

	Department transform(DepartmentParam param) throws Exception;
}
