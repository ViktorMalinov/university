module University {
	requires com.fasterxml.jackson.databind;
	requires com.fasterxml.jackson.core;
	exports main.dataaccess.common;
	exports main.dataaccess.apigroup.dao;
	exports main.dataaccess.apigroupuser.dao;
	exports main.dataaccess.apiuser.dao;
	exports main.dataaccess.department.dao;
	exports main.dataaccess.discipline.dao;
	exports main.dataaccess.faculty.dao;
	exports main.dataaccess.facultydiscipline.dao;
	exports main.dataaccess.lecturer.dao;
	exports main.dataaccess.speciality.dao;
}