package main.service.department;

public interface DepartmentService {

	DepartmentResult create(DepartmentParam param);
	DepartmentResult get(Long id);
	void update(DepartmentParam param);
	void delete(Long id);

}
