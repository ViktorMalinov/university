package main.service.apigroup;

public interface ApiGroupService {

	ApiGroupResult create(ApiGroupParam param) throws Exception;
	ApiGroupResult get(Long id) throws Exception;
	void update(ApiGroupParam param) throws Exception;
	void delete(Long id);

}