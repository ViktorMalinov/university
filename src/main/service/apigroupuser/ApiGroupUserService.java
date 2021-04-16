package main.service.apigroupuser;

public interface ApiGroupUserService {

	ApiGroupUserResult create(ApiGroupUserParam param);
	ApiGroupUserResult get(Long id);
	void update(ApiGroupUserParam param);
	void delete(Long id);

}
