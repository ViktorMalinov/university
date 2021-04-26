package main.dataaccess.apigroup.repo;

import java.util.List;

import main.dataaccess.apigroup.dao.ApiGroup;

public interface ApiGroupRepoManager {

	ApiGroup insert(ApiGroup entity);
	ApiGroup select(Long id);
	void update(ApiGroup entity);
	void delete(Long id);
	List<ApiGroup> selectAll();

}
