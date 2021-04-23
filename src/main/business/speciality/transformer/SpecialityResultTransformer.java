package main.business.speciality.transformer;

import main.dataaccess.speciality.dao.Speciality;
import main.service.speciality.SpecialityResult;

public interface SpecialityResultTransformer {

	SpecialityResult transform(Speciality entity) throws Exception;
}
