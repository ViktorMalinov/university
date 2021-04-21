package main.business.speciality.processor;

import main.service.speciality.SpecialityParam;
import main.service.speciality.SpecialityResult;

public interface SpecialityProcessor {

	SpecialityResult create(SpecialityParam param) throws Exception;
	SpecialityResult get(Long id) throws Exception;
	void update(SpecialityParam param) throws Exception;
	void delete(Long id);

}
