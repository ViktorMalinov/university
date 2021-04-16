package main.service.apiuser;

public interface ApiUserService {

	ApiUserResult create(ApiUserParam param);
	ApiUserResult get(Long id);
	void update(ApiUserParam param);
	void delete(Long id);
	
}
