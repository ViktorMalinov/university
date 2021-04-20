package main.service.department;

public interface DepartmentService {

	DepartmentResult create(DepartmentParam param) throws Exception;
	DepartmentResult get(Long id) throws Exception;
	void update(DepartmentParam param) throws Exception;
	void delete(Long id);

}
