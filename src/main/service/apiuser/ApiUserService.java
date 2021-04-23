package main.service.apiuser;

public interface ApiUserService {

	ApiUserResult create(ApiUserParam param) throws Exception;
	ApiUserResult get(Long id) throws Exception;
	void update(ApiUserParam param) throws Exception;
	void delete(Long id) throws Exception;
	
}
