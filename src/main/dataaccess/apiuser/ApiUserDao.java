package main.dataaccess.apiuser;


public interface ApiUserDao {

	ApiUser create(ApiUser obj);
	ApiUser get(Long id);
	void update(ApiUser obj);
	void delete(Long id);
	
}
