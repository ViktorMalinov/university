package main.business.speciality.processor;

import main.service.speciality.SpecialityParam;
import main.service.speciality.SpecialityResult;

public interface SpecialityProcessor {

	SpecialityResult create(SpecialityParam param);
	SpecialityResult get(Long id);
	void update(SpecialityParam param);
	void delete(Long id);

}
