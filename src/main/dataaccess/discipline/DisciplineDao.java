package main.dataaccess.discipline;


public interface DisciplineDao {
	
	Discipline create(Discipline obj);
	Discipline get(Long id);
	void update(Discipline obj);
	void delete(Long id);
}
