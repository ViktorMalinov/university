package main.dataaccess.speciality.repo;

import java.util.List;

import main.dataaccess.speciality.dao.Speciality;

public interface SpecialityRepoManager {

	Speciality insert(Speciality entity);
	Speciality select(Long id);
	void update(Speciality entity);
	void delete(Long id);
	List<Speciality> selectAll();
}
