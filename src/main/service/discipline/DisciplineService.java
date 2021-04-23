package main.service.discipline;

public interface DisciplineService {

	DisciplineResult create(DisciplineParam param) throws Exception;
	DisciplineResult get(Long id) throws Exception;
	void update(DisciplineParam param) throws Exception;
	void delete(Long id);
	
}
