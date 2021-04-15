package main.dataaccess.apigroupuser;

public interface ApiGroupUserDao {

	ApiGroupUser create(ApiGroupUser gu);
	ApiGroupUser get(Long id);
	void update(ApiGroupUser gu);
	void delete(Long id);
}
