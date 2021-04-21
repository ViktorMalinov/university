package main.service.apigroupuser;

public interface ApiGroupUserService {

	ApiGroupUserResult create(ApiGroupUserParam param) throws Exception;
	ApiGroupUserResult get(Long id) throws Exception;
	void update(ApiGroupUserParam param) throws Exception;
	void delete(Long id);

}
