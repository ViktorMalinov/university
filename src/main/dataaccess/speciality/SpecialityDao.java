package main.dataaccess.speciality;



public interface SpecialityDao {

	Speciality create(Speciality obj);
	Speciality get(Long id);
	void update(Speciality obj);
	void delete(Long id);

}
