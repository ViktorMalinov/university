package main.service.speciality;

public interface SpecialityService {

	SpecialityResult create(SpecialityParam param) throws Exception;
	SpecialityResult get(Long id) throws Exception;
	void update(SpecialityParam param) throws Exception;
	void delete(Long id);

}
