package main.business.speciality.transformer;

import main.dataaccess.speciality.Speciality;
import main.service.speciality.SpecialityResult;

public interface SpecialityResultTransformer {

	SpecialityResult transform(Speciality obj);
}
