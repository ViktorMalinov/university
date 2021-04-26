package main.dataaccess.discipline.repo;

import java.util.List;

import main.dataaccess.discipline.dao.Discipline;

public interface DisciplineRepoManager {

	Discipline insert(Discipline entity);
	Discipline select(Long id);
	void update(Discipline entity);
	void delete(Long id);
	List<Discipline> selectAll();
}
