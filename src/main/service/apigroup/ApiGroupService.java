package main.service.apigroup;

public interface ApiGroupService {

	ApiGroupResult create(ApiGroupParam param);
	ApiGroupResult get(Long id);
	void update(ApiGroupParam param);
	void delete(Long id);

}