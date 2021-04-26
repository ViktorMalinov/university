package main.dataaccess.discipline.dao;

import java.util.List;

public interface DisciplineDao {
	
	Discipline create(Discipline obj);
	Discipline get(Long id);
	void update(Discipline obj);
	void delete(Long id);
	List<Discipline> selectAll();
}
