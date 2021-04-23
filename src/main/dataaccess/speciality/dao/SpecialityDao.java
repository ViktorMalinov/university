package main.dataaccess.speciality.dao;

import java.util.Set;

public interface SpecialityDao {

	Speciality create(Speciality obj);
	Speciality get(Long id);
	void update(Speciality obj);
	void delete(Long id);
	Set<Long> getKeySet();
}
