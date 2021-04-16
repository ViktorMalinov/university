package main.service.discipline;

public interface DisciplineService {

	DisciplineResult create(DisciplineParam param);
	DisciplineResult get(Long id);
	void update(DisciplineParam param);
	void delete(Long id);
	
}
