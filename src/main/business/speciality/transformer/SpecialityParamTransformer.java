package main.business.speciality.transformer;

import main.dataaccess.speciality.dao.Speciality;
import main.service.speciality.SpecialityParam;

public interface SpecialityParamTransformer {

	Speciality transform(SpecialityParam param) throws Exception;
}
