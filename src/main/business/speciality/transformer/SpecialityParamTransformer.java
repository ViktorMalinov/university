package main.business.speciality.transformer;

import main.dataaccess.speciality.Speciality;
import main.service.speciality.SpecialityParam;

public interface SpecialityParamTransformer {

	Speciality transform(SpecialityParam obj);
}
