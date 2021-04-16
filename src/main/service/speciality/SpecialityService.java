package main.service.speciality;

public interface SpecialityService {

	SpecialityResult create(SpecialityParam param);
	SpecialityResult get(Long id);
	void update(SpecialityParam param);
	void delete(Long id);

}
