package main.dataaccess.discipline;

import java.util.Set;

public interface DisciplineDao {
	
	Discipline create(Discipline obj);
	Discipline get(Long id);
	void update(Discipline obj);
	void delete(Long id);
	Set<Long> getKeySet();
}
