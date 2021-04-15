package main.dataaccess.apiuser;


public interface ApiUserDao {

	ApiUser create(ApiUser usr);
	ApiUser get(Long id);
	void update(ApiUser usr);
	void delete(Long id);
	
}
