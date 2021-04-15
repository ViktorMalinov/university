package main.dataaccess.apigroupuser;

public interface ApiGroupUserDao {

	ApiGroupUser create(ApiGroupUser obj);
	ApiGroupUser get(Long id);
	void update(ApiGroupUser obj);
	void delete(Long id);
}
